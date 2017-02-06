package app.com.example.android.udacityprocess;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by FJTK on 2017/2/6.
 */

public class PlaceholderFragment extends Fragment implements View.OnClickListener {

    private static Toast mToast = null;

    public PlaceholderFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.hot_film).setOnClickListener(this);
        view.findViewById(R.id.stock).setOnClickListener(this);
        view.findViewById(R.id.reader).setOnClickListener(this);
        view.findViewById(R.id.news).setOnClickListener(this);
        view.findViewById(R.id.graduation_project).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.hot_film:
                showToast(R.string.hot_film_toast);
                break;
            case R.id.stock:
                showToast(R.string.stock_toast);
                break;
            case R.id.reader:
                showToast(R.string.xyz_reader_toast);
                break;
            case R.id.news:
                showToast(R.string.newest_news_toast);
                break;
            case R.id.graduation_project:
                showToast(R.string.graduation_project_toast);
                break;
        }
    }

    private void showToast(int resId){
        if(mToast == null){
            mToast = Toast.makeText(getContext(),resId,Toast.LENGTH_SHORT);
        }else{
            mToast.setText(getString(resId));
        }
        mToast.show();
    }
}
