package io.github.mthli.knifedemo;

import android.app.Activity;
import android.os.Bundle;

public class ShowActivity extends Activity {
    MarkdownPreviewView markdownPreviewView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
         markdownPreviewView=(MarkdownPreviewView) findViewById(R.id.markdownView);
        final String content="认错人vu欢迎参观vu好\n" +
                "![image](file:///storage/emulated/0/DCIM/Camera/IMG_20171112_110702.jpg)\n" +
                "\n" +
                " **承认测ui也心疼不就** \n" +
                " \n" +
                "v忍心饿不孕不育奴奴u你\n" +
                "# v封测不君妮努i那你i你\n" +
                "> V版测v图你ii没承认戏王之王他不要v发测孕棒努不糊\n" +
                " `妇人心饿吃v天怒你i你` \n" +
                " \n" +
                "-------\n" +
                " `发虚初步呼叫` \n";
        final String mContent=getIntent().getStringExtra("content");


        markdownPreviewView.setOnLoadingFinishListener(new MarkdownPreviewView.OnLoadingFinishListener() {
            @Override
            public void onLoadingFinish() {
                markdownPreviewView.parseMarkdown(mContent, true);
            }
        });
    }
}
