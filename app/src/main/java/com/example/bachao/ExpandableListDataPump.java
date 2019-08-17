package com.example.bachao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String,List<String>>();

        List<String> earthquake = new ArrayList<>();
        earthquake.add("Drop, take cover, and hold on. This means you should drop to the ground, get under a sturdy shelter, maybe a desk or table, and hold on until the ground stops shaking.");


        List<String> flood = new ArrayList<>();
        flood.add("Listen to tv and radio for flooding information. If you get warning of flooding then immediately escape or leave your shelter. If you struck in flood then seek higher ground.");

        List<String> fire = new ArrayList<>();
        fire.add("Have a fire evacuation plan for your family with multiple routes of escape from all rooms of the house. If you live in a multi-level home, consider installing escape ladders in the upper levels. If a fire occurs, get out immediately. Do not put yourself in danger by placing a phone call or gathering your valuables.");

        List<String> explosion = new ArrayList<>();
        explosion.add("Take shelter under a desk or table during the explosion, and exit the building as soon as possible once it’s over. Avoid using elevators and be careful of hot doors, since there may be fire on the other side.");

        List<String> drought = new ArrayList<>();
        drought.add("Conserve Water with daily tasks. Turn off the faucet. Whether you're washing your hands, your teeth or your face, turn the water off when you're not actually using it. Store rainwater for emergency situation.");

        expandableListDetail.put("Earthquake", earthquake);
        expandableListDetail.put("Flood", flood);
        expandableListDetail.put("Fire Evacuation", fire);
        expandableListDetail.put("Explosion", explosion);
        expandableListDetail.put("Drought", drought);
        return expandableListDetail;
    }
}
