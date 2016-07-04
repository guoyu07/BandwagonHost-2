package me.pexcn.bandwagonhost.feature.hostmanager.ui;

import java.util.List;

import me.pexcn.bandwagonhost.bean.Host;

/**
 * Created by pexcn on 2016-06-29.
 */
public interface IHostManagerView {
    void insertItem(Host host);

    void removeItem(int position);

    void showList(List<Host> hosts);

    void showInsertHostDialog();

    void showTips(String msg, int duration);
}
