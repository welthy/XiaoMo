package cn.welthy.main.views.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.List;

import cn.welthy.main.bean.ArticleBean;

public abstract class BaseFragment extends Fragment {

    private List<ArticleBean> mArticles;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = LayoutInflater.from(getActivity()).inflate(getLayoutId(), container, false);
        return root;
    }

    protected abstract int getLayoutId();
    protected abstract void loadArticles(List<ArticleBean> mArticles);

}
