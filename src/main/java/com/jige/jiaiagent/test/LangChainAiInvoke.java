package com.jige.jiaiagent.test;

import com.jige.jiaiagent.demo.invoke.TestApiKey;
import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.model.chat.ChatLanguageModel;

public class LangChainAiInvoke {

    public static void main(String[] args) {
        ChatLanguageModel qwenModel = QwenChatModel.builder()
                .apiKey(TestApiKey.API_KEY)
                .modelName("qwen-max")
                .build();
        String answer = qwenModel.chat("我是程序员鸡哥，我今年3岁啦！");
        System.out.println(answer);
    }
}
