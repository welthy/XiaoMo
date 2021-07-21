package cn.welthy.main.views.fragments;

import java.util.List;

import cn.welthy.main.R;
import cn.welthy.main.bean.ArticleBean;

public class AndroidFragment extends BaseFragment{

    private List<ArticleBean> mArticles;

    @Override
    protected int getLayoutId() {
        return R.layout.android_fragment_layout;
    }

    @Override
    protected void loadArticles(List<ArticleBean> mArticles) {
        this.mArticles = mArticles;
    }
}
