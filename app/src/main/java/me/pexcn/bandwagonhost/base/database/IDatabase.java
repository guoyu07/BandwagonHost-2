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

package me.pexcn.bandwagonhost.base.database;

import java.util.List;

/**
 * Created by pexcn on 2016-06-30.
 */
public interface IDatabase<T> {
    void insert(T t);

    void remove(int id);

    T query(int id);

    List<T> queryAll();

    List queryAll(String field);

    void update(T t);

    void open();

    void close();

    boolean isOpen();

    boolean isEmpty();
}