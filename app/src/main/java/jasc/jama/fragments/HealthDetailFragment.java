package jasc.jama.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;

import java.util.List;

import jasc.jama.R;
import jasc.jama.adapters.ReportListAdapter;

/**
 * Created by anirudhraghunath on 17/10/15.
 */
public class HealthDetailFragment extends Fragment {

    private String type;
    private ListView reportListView;

    public void setType(String type) {

        this.type = type;
    }

    public static HealthDetailFragment newInstance(String type) {

        HealthDetailFragment f = new HealthDetailFragment();
        f.setType(type);
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_health_detail, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        reportListView = (ListView) view.findViewById(R.id.report_list_view);
        ParseQuery<ParseObject> query = ParseQuery.getQuery("Details");
        query.whereEqualTo("user_id", ParseUser.getCurrentUser().getObjectId());
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if (objects.size() == 0) {
                }
                if (e == null)
                    reportListView.setAdapter(new ReportListAdapter(getContext(), objects));
                else
                    e.printStackTrace();
            }
        });
    }
}
