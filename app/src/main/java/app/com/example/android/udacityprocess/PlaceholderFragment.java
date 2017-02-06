package app.com.example.android.udacityprocess;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by FJTK on 2017/2/6.
 */

public class PlaceholderFragment extends Fragment implements View.OnClickListener {

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
        Button btn1 = (Button) view.findViewById(R.id.hot_film);
        Button btn2 = (Button) view.findViewById(R.id.stock);
        Button btn3 = (Button) view.findViewById(R.id.reader);
        Button btn4 = (Button) view.findViewById(R.id.news);
        Button btn5 = (Button) view.findViewById(R.id.graduation_project);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.hot_film:
                showToast("热门电影开始运行");
                break;
            case R.id.stock:
                showToast("股票雄鹰开始运行");
                break;
            case R.id.reader:
                showToast("阅读器开始运行");
                break;
            case R.id.news:
                showToast("最新新闻开始运行");
                break;
            case R.id.graduation_project:
                showToast("毕业设计开始运行");
                break;
        }
    }

    private void showToast(String s) {
        Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
    }
}
