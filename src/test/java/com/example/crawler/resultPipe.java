package com.example.crawler;

import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;
import java.util.Map;

public class resultPipe implements Pipeline {
    @Override
    public void process(ResultItems resultItems, Task task) {
        Map<String, Object> map = resultItems.getAll();
        Object o = map.get("com.example.crawler.CrawlerAnnationDemo");
        CrawlerAnnationDemo demo =(CrawlerAnnationDemo)o;
        System.out.println(demo.toString());
        /*ArrayList<CrawlerAnnationDemo> list =(ArrayList<CrawlerAnnationDemo>)o;
        for(CrawlerAnnationDemo demo:list){
            PubFun.writeText("角色名称："+demo.getNames());
        }*/
    }
}
