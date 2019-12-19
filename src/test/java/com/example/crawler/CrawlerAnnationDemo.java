package com.example.crawler;

import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.model.ConsolePageModelPipeline;
import us.codecraft.webmagic.model.OOSpider;
import us.codecraft.webmagic.model.annotation.ExtractBy;
import us.codecraft.webmagic.model.annotation.HelpUrl;
import us.codecraft.webmagic.model.annotation.TargetUrl;

import java.util.List;

@TargetUrl("http://tl.cyg.changyou.com/")
@HelpUrl("http://tl.cyg.changyou.com/")
public class CrawlerAnnationDemo {
    @ExtractBy("//title/text()")
    private String title;
    @ExtractBy("//ul[@id='J_good_list']/li[@class='role-item']/dl/dt/a/text()")
    private List<String> names;
    //http://tl.cyg.changyou.com/goods/selling?world_id=0&have_chosen=&page_num=2#goodsTag
    @ExtractBy("//div[@class='ui-pagination']/a[@href]")
    private List<String> urls;
    public static void main(String[] args) {
        OOSpider.create(Site.me().setSleepTime(1000)
                , new ConsolePageModelPipeline(), CrawlerAnnationDemo.class)
                .addPipeline(new resultPipe())
                .addUrl("http://tl.cyg.changyou.com/").thread(5).run();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    @Override
    public String toString() {
        return "CrawlerAnnationDemo{" +
                "title='" + title + '\'' +
                ", names=" + names +
                ", urls=" + urls +
                '}';
    }
}
