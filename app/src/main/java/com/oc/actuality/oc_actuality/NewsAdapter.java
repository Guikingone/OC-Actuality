package com.oc.actuality.oc_actuality;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.oc.rss.fake.FakeNews;
import com.oc.rss.fake.FakeNewsList;

import java.util.List;

/**
 * Created by Guillaume on 10/07/2016.
 */
public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private List<FakeNews> _list_News = FakeNewsList.all;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView _list;
        public ViewHolder(View view) {
            super(view);
            _list = (TextView) view.findViewById(R.id.title);
        }
        public void bind(FakeNews _list_fake) {
            _list_fake.toString();
        }
    }

    @Override
    public int getItemCount() {
        return _list_News.size();
    }

    @Override
    public NewsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                                  .inflate(R.layout.activity_main, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(_list_News.get(position));
    }
}
