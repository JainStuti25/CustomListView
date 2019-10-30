package www.xyz.peoplelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] name = {"Facebook", "Whatsapp" , "Twitter"};
    int[] myimages = {R.drawable.activity_lifecycle, R.drawable.trash, R.drawable.trashbin};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);
        CustomAdaptor customAdaptor = new CustomAdaptor();
        listView.setAdapter(customAdaptor);

    }

    class CustomAdaptor extends BaseAdapter{

        @Override
        public int getCount() {
            return myimages.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.mylayout, null);
            ImageView image = view.findViewById(R.id.imageview);
            TextView text = view.findViewById(R.id.textview);
            image.setImageResource(myimages[position]);
            text.setText(name[position]);
            return view;
        }
    }
}
