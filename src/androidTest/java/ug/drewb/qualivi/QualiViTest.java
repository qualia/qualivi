package ug.drewb.qualivi;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class ug.drewb.qualivi.QualiViTest \
 * ug.drewb.qualivi.tests/android.test.InstrumentationTestRunner
 */
public class QualiViTest extends ActivityInstrumentationTestCase2<QualiVi> {

    public QualiViTest() {
        super("ug.drewb.qualivi", QualiVi.class);
    }

}
