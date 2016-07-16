/*
 * BandwagonHost - A bandwagonhost.com client for Android
 * Copyright (C) 2016 Xingyu Chen <pexcn97@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package me.pexcn.bandwagonhost.feature.manager.model;

import android.content.Context;

import java.util.List;

import me.pexcn.bandwagonhost.Constants;
import me.pexcn.bandwagonhost.feature.manager.bean.Profile;
import me.pexcn.bandwagonhost.database.ProfileDatabase;

/**
 * Created by pexcn on 2016-07-01.
 */
public class ManagerModel implements IManagerModel {
    /**
     * TODO: 优化数据库查询操作
     */
    private Context mContext;
    private ProfileDatabase mDatabase;

    public ManagerModel(Context context) {
        this.mContext = context;
        this.mDatabase = ProfileDatabase.getInstance(mContext);
    }

    @Override
    public boolean isEmptyProfile() {
        return mDatabase.isEmpty();
    }

    @Override
    public void insertProfile(Profile profile) {
        mDatabase.insert(profile);
    }

    @Override
    public void removeProfile(int id) {
        mDatabase.remove(id);
    }

    @Override
    public List<Profile> getProfileList() {
        return mDatabase.queryAll();
    }

    @Override
    public List<Integer> getProfileIds() {
        return mDatabase.queryAll(Constants.MANAGER.DATABASE.TABLE_COLUMN_ID);
    }
}