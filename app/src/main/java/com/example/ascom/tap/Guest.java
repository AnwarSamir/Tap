package com.example.ascom.tap;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by ascom on 22/10/2015.
 */
public class Guest extends Fragment {

    private ListView listView1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.guest_xml, container, false);
        Item User[] = new Item[]
                {
                        new Item(R.drawable.userf, "Sara","Guest","i will be in egypt next month and i need some one take me to some places i never see befor if you interdting to to this pleas Connect me "),
                        new Item(R.drawable.userm, "Hazem","Host","i am full time free for you just connect with me and i will take you to some places you never see befot in egypt "),
                        new Item(R.drawable.userm, "Omar","Guest","hello all connect with me and ask what you want"),
                        new Item(R.drawable.userm, "Hassan","Host",""),
                        new Item(R.drawable.userm, "Ahmed ","Host","hello, my name is Ahmed i can help you to discover my country and see things very goot just connect with me  "),

                };
        ItemAdabter adapter = new ItemAdabter(getActivity(),
                R.layout.listview_header_row, User);
        listView1 = (ListView)rootView.findViewById(R.id.listView);
        listView1.setAdapter(adapter);
        return rootView;
    }
}
