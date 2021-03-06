/*
 *     Copyright (C) 2016  Merbin J Anselm <merbinjanselm@gmail.com>
 *
 *     This program is free software; you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation; either version 2 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License along
 *     with this program; if not, write to the Free Software Foundation, Inc.,
 *     51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package in.blogspot.anselmbros.torchie.main.manager.device;

import android.content.Context;

import in.blogspot.anselmbros.torchie.utils.Constants;

/**
 * Created by I327891 on 04-Feb-17.
 */

public abstract class Device {

    public static final String TYPE = Constants.ID_DEVICE;

    protected final Context mContext;
    protected String deviceType;
    protected boolean isEnabled;

    public Device(Context context) {
        this.mContext = context;
        this.deviceType = TYPE;
        isEnabled = false;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }


    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}
