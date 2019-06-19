package ute.com.learnrxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class MainOtherActivity extends AppCompatActivity {
    private String TAG = MainOtherActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_other);
        Observable.intervalRange(2, 5, 0, 5, TimeUnit.SECONDS)
                .subscribe(new Observer< Long >() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.d(TAG, "==============onSubscribe ");
                    }

                    @Override
                    public void onNext(Long aLong) {
                        Log.d(TAG, "==============onNext " + aLong);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
