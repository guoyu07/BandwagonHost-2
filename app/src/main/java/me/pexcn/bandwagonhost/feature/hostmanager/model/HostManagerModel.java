package me.pexcn.bandwagonhost.feature.hostmanager.model;

import android.content.Context;

import me.pexcn.bandwagonhost.bean.Host;
import me.pexcn.bandwagonhost.database.HostDatabase;
import me.pexcn.bandwagonhost.feature.hostmanager.listener.OnAddHostStateListener;

/**
 * Created by pexcn on 2016-07-01.
 */
public class HostManagerModel implements IHostManagerModel {
    private Context mContext;
    private HostDatabase mDatabase;

    public HostManagerModel(Context context) {
        this.mContext = context;
        mDatabase = HostDatabase.getInstance(mContext);
    }

    @Override
    public void addHost(String title, String veid, String key, OnAddHostStateListener listener) {
        // TODO: 如果有相同title则提示
        Host host = new Host(title, veid, key);
        mDatabase.insert(host);
        listener.onFinished(host.getTitle());
    }
}