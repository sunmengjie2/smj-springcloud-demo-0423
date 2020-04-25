package com.smj.service.controller;

import com.smj.service.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UploadController {
    @Value("${file.path}")
    private String filePath;

    @Value("${file.domain}")
    private String fileDomain;

    @RequestMapping("upload")
    public Object upload(@RequestParam("file") MultipartFile file) throws IOException {
        System.out.println(file + "**********");
        //定义返回结果
        HashMap<String, Object> resultMap = new HashMap<>();
        resultMap.put("result",false);
        resultMap.put("msg","图片上传失败");
        //定义保存文件名称
        String originalFilename = file.getOriginalFilename();
        String fileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
        String fileFullName = filePath + fileName;
        //保存文件
        File saveFile = new File(fileFullName);
        try {
            file.transferTo(saveFile);
            resultMap.put("result",true);
            resultMap.put("fileName",fileName);
            resultMap.put("fileUrl",fileDomain+fileName);
            resultMap.put("msg","图片上传成功");
        } catch (IOException e) {
            e.printStackTrace();
            return resultMap;
        }
        return resultMap;
    }
}
