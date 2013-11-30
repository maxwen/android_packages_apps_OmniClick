/*
 * Copyright (C) 2013 The Android Open Source Project
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

package org.omnirom.ble;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String FIND_ME_ALERT_LEVEL = "00002a06-0000-1000-8000-00805f9b34fb";
    public static String TX_POWER_LEVEL = "00002a07-0000-1000-8000-00805f9b34fb";
    public static String OPPO_OTOUCH_CLICK = "f000ffe1-0451-4000-b000-000000000000";
    public static String OPPO_OTOUCH = "0000ffe0-0000-1000-8000-00805f9b34fb";

    static {
        // find me Services.
        attributes.put("00001802-0000-1000-8000-00805f9b34fb", "Immediate Alert");
        attributes.put(FIND_ME_ALERT_LEVEL, "Alert level");

        attributes.put("00001800-0000-1000-8000-00805f9b34fb", "Generic Access");
        attributes.put("00001801-0000-1000-8000-00805f9b34fb", "Generic Attribute");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Informations");
        attributes.put("00001803-0000-1000-8000-00805f9b34fb", "Link Loss");
        attributes.put("00001804-0000-1000-8000-00805f9b34fb", "Tx Power");
        attributes.put(TX_POWER_LEVEL, "Tx Power level");

        attributes.put(OPPO_OTOUCH, "O-Touch");
        attributes.put(OPPO_OTOUCH_CLICK, "O-Touch click");

    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
