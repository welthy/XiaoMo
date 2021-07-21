package cn.welthy.main.views.fragments;

import java.util.List;

import cn.welthy.main.R;
import cn.welthy.main.bean.ArticleBean;

public class JavaFragment extends BaseFragment{

    @Override
    protected int getLayoutId() {
        return R.layout.java_fragment_layout;
    }

    @Override
    protected void loadArticles(List<ArticleBean> mArticles) {

    }
}
