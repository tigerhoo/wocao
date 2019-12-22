package com.skson.wocao;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class DemoController {

    private Logger log = LoggerFactory.getLogger(DemoController.class);
    @Autowired
    private RestTemplate rest;

    @RequestMapping("/authrization2")
    public Object getAuthrization2(){
        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json;charset=gbk");
        headers.setContentType(type);
        headers.set("cookie","thw=cn; t=cfdbc4ba5afb5612fee6c59aea432ff8; hng=CN%7Czh-CN%7CCNY%7C156; cookie2=760de1f5171b94e5cae8b32f9c119933; _tb_token_=ee6f3e3e78eee; mt=ci=0_0; cna=bodFFu7PowgCAduFZRpNLveh; v=0; lgc=%5Cu8BEF%5Cu4F1A%5Cu662F%5Cu8BEF%5Cu4F1A; dnk=%5Cu8BEF%5Cu4F1A%5Cu662F%5Cu8BEF%5Cu4F1A; tracknick=%5Cu8BEF%5Cu4F1A%5Cu662F%5Cu8BEF%5Cu4F1A; tg=4; enc=jrV5uQ1eSwL04hmAf%2BrZBItQ7W1jglN6JofHthn2HjqzxszQ%2Fec3IhAIDTf3SrNZC9wG93G3ZWJ3ZCR2dBUkRA%3D%3D; unb=2206763102151; cookie17=UUphzOV3U2gewUntMA%3D%3D; _l_g_=Ug%3D%3D; sg=%E4%BC%9A1f; _nk_=%5Cu8BEF%5Cu4F1A%5Cu662F%5Cu8BEF%5Cu4F1A; cookie1=AQDPLTzF6pRvre1nU78CLwE3r2DVTF%2Bryj9IspJAxpY%3D; _m_h5_tk=26d87df4a382cee7ab7c48264cbf6691_1577014621270; _m_h5_tk_enc=af148ad0b12bbf599ceec54cd723468b; uc1=cookie14=UoTbmhDfqo5%2Bbw%3D%3D&tag=8&lng=zh_CN&pas=0&existShop=false&cookie16=U%2BGCWk%2F74Mx5tgzv3dWpnhjPaQ%3D%3D&cookie15=W5iHLLyFOGW7aA%3D%3D&cookie21=VT5L2FSpczFp; uc3=nk2=rWpwux%2Fty5SV9w%3D%3D&lg2=W5iHLLyFOGW7aA%3D%3D&vt3=F8dByuqjr4vtlzG1XRM%3D&id2=UUphzOV3U2gewUntMA%3D%3D; csg=596a9ce1; skt=b058d9c817abc8d5; existShop=MTU3NzAwNzczMw%3D%3D; uc4=id4=0%40U2grF864zCrDAtcknEEX39ENdw0q3TDd&nk4=0%40r5ulaTP5Zb2REG6BwHk%2BgY39cQJD; _cc_=V32FPkk%2Fhw%3D%3D; l=dBMDjErnqqTk3v0wBOfwdurza77t5Bdf1sPzaNbMiICPOUf9lKPhWZLHibYpCnGV3sm2R3rEQAfYBATUEy4Eho-IegCoU5mj6LYpR; isg=BPv7ixJjIv3FHh5KDItZ6BRIit9hhA9SGhArae2_MPomTBgudSF5oyjKZqyn7GdK");
        headers.set("referer","https://we.taobao.com/publish/post?formName=daren_general_video_publish_10357");
        //        headers.add("Accept", MediaType.APPLICATION_JSON.toString());

//        JSONObject jsonObj = JSONObject.parseObject(params);

        HttpEntity<String> formEntity = new HttpEntity<>(headers);

        String url = "https://ugc.taobao.com/ajax/getAuthrization2.do?bizCode=daren_general_video_publish_10357&_tb_token_=ee6f3e3e78eee";
        ResponseEntity<String> respAuth =  rest.exchange(url, HttpMethod.GET,formEntity,String.class);
        log.info("respAuth,{}", JSON.toJSONString(respAuth));
        RespAuth resp = JSONObject.parseObject(respAuth.getBody(),RespAuth.class);
        log.info("resp,{}", JSON.toJSONString(resp.getData()));
        return respAuth;
    }

    @RequestMapping("/blockInit")
    public Object blockInit(){
        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json;charset=gbk");
        headers.setContentType(type);
//        headers.set("cookie","thw=cn; t=cfdbc4ba5afb5612fee6c59aea432ff8; hng=CN%7Czh-CN%7CCNY%7C156; cookie2=760de1f5171b94e5cae8b32f9c119933; _tb_token_=ee6f3e3e78eee; mt=ci=0_0; cna=bodFFu7PowgCAduFZRpNLveh; v=0; lgc=%5Cu8BEF%5Cu4F1A%5Cu662F%5Cu8BEF%5Cu4F1A; dnk=%5Cu8BEF%5Cu4F1A%5Cu662F%5Cu8BEF%5Cu4F1A; tracknick=%5Cu8BEF%5Cu4F1A%5Cu662F%5Cu8BEF%5Cu4F1A; tg=4; enc=jrV5uQ1eSwL04hmAf%2BrZBItQ7W1jglN6JofHthn2HjqzxszQ%2Fec3IhAIDTf3SrNZC9wG93G3ZWJ3ZCR2dBUkRA%3D%3D; unb=2206763102151; cookie17=UUphzOV3U2gewUntMA%3D%3D; _l_g_=Ug%3D%3D; sg=%E4%BC%9A1f; _nk_=%5Cu8BEF%5Cu4F1A%5Cu662F%5Cu8BEF%5Cu4F1A; cookie1=AQDPLTzF6pRvre1nU78CLwE3r2DVTF%2Bryj9IspJAxpY%3D; _m_h5_tk=26d87df4a382cee7ab7c48264cbf6691_1577014621270; _m_h5_tk_enc=af148ad0b12bbf599ceec54cd723468b; uc1=cookie14=UoTbmhDfqo5%2Bbw%3D%3D&tag=8&lng=zh_CN&pas=0&existShop=false&cookie16=U%2BGCWk%2F74Mx5tgzv3dWpnhjPaQ%3D%3D&cookie15=W5iHLLyFOGW7aA%3D%3D&cookie21=VT5L2FSpczFp; uc3=nk2=rWpwux%2Fty5SV9w%3D%3D&lg2=W5iHLLyFOGW7aA%3D%3D&vt3=F8dByuqjr4vtlzG1XRM%3D&id2=UUphzOV3U2gewUntMA%3D%3D; csg=596a9ce1; skt=b058d9c817abc8d5; existShop=MTU3NzAwNzczMw%3D%3D; uc4=id4=0%40U2grF864zCrDAtcknEEX39ENdw0q3TDd&nk4=0%40r5ulaTP5Zb2REG6BwHk%2BgY39cQJD; _cc_=V32FPkk%2Fhw%3D%3D; l=dBMDjErnqqTk3v0wBOfwdurza77t5Bdf1sPzaNbMiICPOUf9lKPhWZLHibYpCnGV3sm2R3rEQAfYBATUEy4Eho-IegCoU5mj6LYpR; isg=BPv7ixJjIv3FHh5KDItZ6BRIit9hhA9SGhArae2_MPomTBgudSF5oyjKZqyn7GdK");
        headers.set("referer","https://we.taobao.com/publish/post?formName=daren_general_video_publish_10357");
        headers.set("Authorization","UPLOAD_AK_TOP MjMzNTM1NTY6ZXlKaWFYcERiMlJsSWpvaWQyRnVkSFZmWkdGeVpXNGlMQ0prWlhSbFkzUk5hVzFsSWpveExDSmthWElpT2lJa2UzUmlWWE5sY2tScGNuMGlMQ0prYVhaaFJXNWpiMlJsSWpvd0xDSmxlSEJwY21GMGFXOXVJam96TVRVME5qSTRNalE0T1RFMExDSnBibk5sY25SUGJteDVJam93TENKdVlXMWxJam9pSkh0MWRXbGtmU1I3Ykc5allXeEdhV3hsVTNWbVptbDRmU0lzSW01aGJXVnpjR0ZqWlNJNkltUmhjbVZ1SWl3aWMybDZaVXhwYldsMElqb3pNVFExTnpJNE1EQXNJblJpUlc1a1ZYTmxjaUk2SWpJeU1EWTNOak14TURJeE5URWlMQ0oyYVdSbGIxTmpZVzRpT2pBc0luWnBaR1Z2VTNsdVl5STZNSDA6NGU4Y2RiNDRkNDU2NjliYjYzOWMzODUxN2VjYjBjODM1ODI4ZmRiOQ");
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);
        HttpEntity<MultiValueMap<String, String>> formEntity = new HttpEntity<>(popHeaders(), headers);
        String url = "https://upload.media.aliyun.com/api/proxy/blockInit.json";
        ResponseEntity<String> responseEntity = rest.postForEntity(url, formEntity, String.class);
        log.info("responseEntity,{}", JSON.toJSONString(responseEntity));
        return responseEntity;
    }

    @RequestMapping("/blockUpload")
    public Object blockUpload(){
        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json;charset=gbk");
        headers.setContentType(type);
        headers.set("referer","https://we.taobao.com/publish/post?formName=daren_general_video_publish_10357");
        headers.set("Authorization","UPLOAD_AK_TOP MjMzNTM1NTY6ZXlKaWFYcERiMlJsSWpvaWQyRnVkSFZmWkdGeVpXNGlMQ0prWlhSbFkzUk5hVzFsSWpveExDSmthWElpT2lJa2UzUmlWWE5sY2tScGNuMGlMQ0prYVhaaFJXNWpiMlJsSWpvd0xDSmxlSEJwY21GMGFXOXVJam96TVRVME5qSTRNalE0T1RFMExDSnBibk5sY25SUGJteDVJam93TENKdVlXMWxJam9pSkh0MWRXbGtmU1I3Ykc5allXeEdhV3hsVTNWbVptbDRmU0lzSW01aGJXVnpjR0ZqWlNJNkltUmhjbVZ1SWl3aWMybDZaVXhwYldsMElqb3pNVFExTnpJNE1EQXNJblJpUlc1a1ZYTmxjaUk2SWpJeU1EWTNOak14TURJeE5URWlMQ0oyYVdSbGIxTmpZVzRpT2pBc0luWnBaR1Z2VTNsdVl5STZNSDA6NGU4Y2RiNDRkNDU2NjliYjYzOWMzODUxN2VjYjBjODM1ODI4ZmRiOQ");

        headers.setContentType(MediaType.MULTIPART_FORM_DATA);
        HttpEntity<MultiValueMap<String, Object>> formEntity = new HttpEntity<>(popHeaders2(), headers);
        String url = "https://upload.media.aliyun.com/api/proxy/blockUpload.json";
        ResponseEntity<String> responseEntity = rest.postForEntity(url, formEntity, String.class);
        log.info("responseEntity,{}", JSON.toJSONString(responseEntity));
        return responseEntity;
    }

    @RequestMapping("/uploadPic")
    public Object uploadPic(){
        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json;charset=gbk");
        headers.setContentType(type);
        headers.set("referer","https://we.taobao.com/publish/post?formName=daren_general_video_publish_10357");
        headers.set("cookie","thw=cn; t=cfdbc4ba5afb5612fee6c59aea432ff8; hng=CN%7Czh-CN%7CCNY%7C156; cookie2=760de1f5171b94e5cae8b32f9c119933; _tb_token_=ee6f3e3e78eee; mt=ci=0_0; cna=bodFFu7PowgCAduFZRpNLveh; v=0; lgc=%5Cu8BEF%5Cu4F1A%5Cu662F%5Cu8BEF%5Cu4F1A; dnk=%5Cu8BEF%5Cu4F1A%5Cu662F%5Cu8BEF%5Cu4F1A; tracknick=%5Cu8BEF%5Cu4F1A%5Cu662F%5Cu8BEF%5Cu4F1A; tg=4; enc=jrV5uQ1eSwL04hmAf%2BrZBItQ7W1jglN6JofHthn2HjqzxszQ%2Fec3IhAIDTf3SrNZC9wG93G3ZWJ3ZCR2dBUkRA%3D%3D; unb=2206763102151; cookie17=UUphzOV3U2gewUntMA%3D%3D; _l_g_=Ug%3D%3D; sg=%E4%BC%9A1f; _nk_=%5Cu8BEF%5Cu4F1A%5Cu662F%5Cu8BEF%5Cu4F1A; cookie1=AQDPLTzF6pRvre1nU78CLwE3r2DVTF%2Bryj9IspJAxpY%3D; _m_h5_tk=26d87df4a382cee7ab7c48264cbf6691_1577014621270; _m_h5_tk_enc=af148ad0b12bbf599ceec54cd723468b; uc1=cookie14=UoTbmhDfqo5%2Bbw%3D%3D&tag=8&lng=zh_CN&pas=0&existShop=false&cookie16=U%2BGCWk%2F74Mx5tgzv3dWpnhjPaQ%3D%3D&cookie15=W5iHLLyFOGW7aA%3D%3D&cookie21=VT5L2FSpczFp; uc3=nk2=rWpwux%2Fty5SV9w%3D%3D&lg2=W5iHLLyFOGW7aA%3D%3D&vt3=F8dByuqjr4vtlzG1XRM%3D&id2=UUphzOV3U2gewUntMA%3D%3D; csg=596a9ce1; skt=b058d9c817abc8d5; existShop=MTU3NzAwNzczMw%3D%3D; uc4=id4=0%40U2grF864zCrDAtcknEEX39ENdw0q3TDd&nk4=0%40r5ulaTP5Zb2REG6BwHk%2BgY39cQJD; _cc_=V32FPkk%2Fhw%3D%3D; l=dBMDjErnqqTk3v0wBOfwdurza77t5Bdf1sPzaNbMiICPOUf9lKPhWZLHibYpCnGV3sm2R3rEQAfYBATUEy4Eho-IegCoU5mj6LYpR; isg=BPv7ixJjIv3FHh5KDItZ6BRIit9hhA9SGhArae2_MPomTBgudSF5oyjKZqyn7GdK");

        headers.setContentType(MediaType.MULTIPART_FORM_DATA);
        HttpEntity<MultiValueMap<String, Object>> formEntity = new HttpEntity<>(popHeaders3(), headers);
        String url = "https://resource.taobao.com/pic/upload?categoryId=0&limit=750x750";
        ResponseEntity<String> responseEntity = rest.postForEntity(url, formEntity, String.class);
        log.info("responseEntity,{}", JSON.toJSONString(responseEntity));
        return responseEntity;
    }

    @RequestMapping("/batchImg")
    public Object batchImg(){
        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json;charset=gbk");
        headers.setContentType(type);
        headers.set("referer","https://we.taobao.com/publish/post?formName=daren_general_video_publish_10357");
        headers.set("cookie","thw=cn; t=cfdbc4ba5afb5612fee6c59aea432ff8; hng=CN%7Czh-CN%7CCNY%7C156; cookie2=760de1f5171b94e5cae8b32f9c119933; _tb_token_=ee6f3e3e78eee; mt=ci=0_0; cna=bodFFu7PowgCAduFZRpNLveh; v=0; lgc=%5Cu8BEF%5Cu4F1A%5Cu662F%5Cu8BEF%5Cu4F1A; dnk=%5Cu8BEF%5Cu4F1A%5Cu662F%5Cu8BEF%5Cu4F1A; tracknick=%5Cu8BEF%5Cu4F1A%5Cu662F%5Cu8BEF%5Cu4F1A; tg=4; enc=jrV5uQ1eSwL04hmAf%2BrZBItQ7W1jglN6JofHthn2HjqzxszQ%2Fec3IhAIDTf3SrNZC9wG93G3ZWJ3ZCR2dBUkRA%3D%3D; unb=2206763102151; cookie17=UUphzOV3U2gewUntMA%3D%3D; _l_g_=Ug%3D%3D; sg=%E4%BC%9A1f; _nk_=%5Cu8BEF%5Cu4F1A%5Cu662F%5Cu8BEF%5Cu4F1A; cookie1=AQDPLTzF6pRvre1nU78CLwE3r2DVTF%2Bryj9IspJAxpY%3D; _m_h5_tk=26d87df4a382cee7ab7c48264cbf6691_1577014621270; _m_h5_tk_enc=af148ad0b12bbf599ceec54cd723468b; uc1=cookie14=UoTbmhDfqo5%2Bbw%3D%3D&tag=8&lng=zh_CN&pas=0&existShop=false&cookie16=U%2BGCWk%2F74Mx5tgzv3dWpnhjPaQ%3D%3D&cookie15=W5iHLLyFOGW7aA%3D%3D&cookie21=VT5L2FSpczFp; uc3=nk2=rWpwux%2Fty5SV9w%3D%3D&lg2=W5iHLLyFOGW7aA%3D%3D&vt3=F8dByuqjr4vtlzG1XRM%3D&id2=UUphzOV3U2gewUntMA%3D%3D; csg=596a9ce1; skt=b058d9c817abc8d5; existShop=MTU3NzAwNzczMw%3D%3D; uc4=id4=0%40U2grF864zCrDAtcknEEX39ENdw0q3TDd&nk4=0%40r5ulaTP5Zb2REG6BwHk%2BgY39cQJD; _cc_=V32FPkk%2Fhw%3D%3D; l=dBMDjErnqqTk3v0wBOfwdurza77t5Bdf1sPzaNbMiICPOUf9lKPhWZLHibYpCnGV3sm2R3rEQAfYBATUEy4Eho-IegCoU5mj6LYpR; isg=BPv7ixJjIv3FHh5KDItZ6BRIit9hhA9SGhArae2_MPomTBgudSF5oyjKZqyn7GdK");

        HttpEntity<JSONArray> formEntity = new HttpEntity<>(popHeaders4(), headers);
        String url = "https://resource.taobao.com/crop/batchImg";
        ResponseEntity<String> responseEntity = rest.postForEntity(url, formEntity, String.class);
        log.info("responseEntity,{}", JSON.toJSONString(responseEntity));
        return responseEntity;
    }

    protected MultiValueMap<String, String> popHeaders() {
        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("name","1.mp4");
        map.add("size","24304914");
        map.add("dir","");
        return map;
    }

    protected MultiValueMap<String, Object> popHeaders2() {
        MultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
        map.add("name","1.mp4");
        map.add("size","24304914");
        map.add("id","4968a2cf-d100-4f76-94a1-0c5a67dfc073");
        map.add("uploadId","69192C9F264946278EA95B5A10E37A32");
        map.add("partNumber",1);

        FileSystemResource fileSystemResource = new FileSystemResource("C:/Users/laohu/Desktop/604007640734/1.mp4");
        map.add("file",fileSystemResource);
        return map;
    }

    protected MultiValueMap<String, Object> popHeaders3() {
        MultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
        FileSystemResource fileSystemResource = new FileSystemResource("C:/Users/laohu/Desktop/604007640734/750.jpg");
        map.add("files",fileSystemResource);
        return map;
    }

    protected JSONArray popHeaders4() {
        JSONObject json = new JSONObject();
        json.put("url","//img.alicdn.com/imgextra/i4/2206763102151/O1CN01BS7dqG1RlCW8NXYzK_!!2206763102151-0-daren.jpg");
        json.put("x",0);
        json.put("y",0);
        json.put("w",563);
        json.put("h",750);
        JSONArray array = new JSONArray();
        array.add(json);
        return array;
    }

    public static void main(String[] args) {
        System.out.printf(""+System.currentTimeMillis());
    }
}
