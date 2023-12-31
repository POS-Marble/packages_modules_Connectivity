/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.server.net;

import com.android.net.module.util.Struct;
import com.android.net.module.util.Struct.Field;
import com.android.net.module.util.Struct.Type;

/**
 * Key for both stats maps.
 */
public class StatsMapKey extends Struct {
    @Field(order = 0, type = Type.S32)
    public final int uid;

    @Field(order = 1, type = Type.U32)
    public final long tag;

    @Field(order = 2, type = Type.U32)
    public final long counterSet;

    @Field(order = 3, type = Type.S32)
    public final int ifaceIndex;

    public StatsMapKey(final int uid, final long tag, final long counterSet,
            final int ifaceIndex) {
        this.uid = uid;
        this.tag = tag;
        this.counterSet = counterSet;
        this.ifaceIndex = ifaceIndex;
    }
}
