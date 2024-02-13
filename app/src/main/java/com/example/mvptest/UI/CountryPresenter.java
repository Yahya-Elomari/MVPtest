package com.example.mvptest.UI;
import com.example.mvptest.Model.CountryModel;

public class CountryPresenter {
    private CountryView view;
    public CountryPresenter(CountryView view) {
        this.view = view;
    }
    public CountryModel getCountry() {
        return new CountryModel("Palestine", "AL-Qods", 2000);
    }
    public void getCountryName() {
        view.onGetCountry(getCountry().getName());
    }
}
