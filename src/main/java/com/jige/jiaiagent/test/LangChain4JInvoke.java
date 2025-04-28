package com.jige.jiaiagent.test;


import com.jige.jiaiagent.demo.invoke.TestApiKey;
import dev.langchain4j.community.model.dashscope.WanxImageModel;
import dev.langchain4j.data.image.Image;
import dev.langchain4j.model.output.Response;

public class LangChain4JInvoke {

    /**
     * 调用 灵积 大模型的 文生图大模型
     * 参考文档
     * https://docs.langchain4j.dev/integrations/language-models/dashscope/
     *
     * @param args
     */


    public static void main(String[] args) {
        WanxImageModel wanxImageModel = WanxImageModel.builder()
                .modelName("wanx2.1-t2i-plus")
                .apiKey(TestApiKey.API_KEY)
                .build();
        Response<Image> response = wanxImageModel.generate("鸡哥小黑子");
        System.out.println(response.content().url());

    }
}
