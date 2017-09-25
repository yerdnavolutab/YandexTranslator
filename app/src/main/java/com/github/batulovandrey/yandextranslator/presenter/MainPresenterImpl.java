package com.github.batulovandrey.yandextranslator.presenter;

import com.github.batulovandrey.yandextranslator.ApiClient;
import com.github.batulovandrey.yandextranslator.model.MainModel;
import com.github.batulovandrey.yandextranslator.view.MainView;

/**
 * @author Andrey Batulov on 25/09/2017
 */

public class MainPresenterImpl implements MainPresenter {

    private final MainView mMainView;
    private final MainModel mMainModel;

    public MainPresenterImpl(MainView mainView) {
        mMainView = mainView;
        mMainModel = new MainModel(this, new ApiClient());
    }

    @Override
    public void showProgress() {
        mMainView.showProgress();
    }

    @Override
    public void hideProgress() {
        mMainView.hideProgress();
    }

    @Override
    public void showError() {
        mMainView.showError();
    }

    @Override
    public void showTranslation(String translatedText) {
        mMainView.showTranslation(translatedText);
    }

    @Override
    public void processTranslation(String sourceText) {
        mMainModel.processTranslation(sourceText);
    }
}