package robby.co.tz.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;

public class MainActivity extends AppCompatActivity {

    public static CompactCalendarView compactCalendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        compactCalendarView = (CompactCalendarView) findViewById(R.id.compactcalendar_view);
        compactCalendarView.setUseThreeLetterAbbreviation(true);
        compactCalendarView.showCalendarWithAnimation();
    }
}
