/*
 * NeuronAnimActivity.java
 *
 * Norbiron Game
 * This is a case study for creating sprites for SamuEntropy/Brainboard.
 *
 * Copyright (C) 2016, Dr. Bátfai Norbert
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
 * Ez a program szabad szoftver; terjeszthető illetve módosítható a
 * Free Software Foundation által kiadott GNU General Public License
 * dokumentumában leírtak; akár a licenc 3-as, akár (tetszőleges) későbbi
 * változata szerint.
 *
 * Ez a program abban a reményben kerül közreadásra, hogy hasznos lesz,
 * de minden egyéb GARANCIA NÉLKÜL, az ELADHATÓSÁGRA vagy VALAMELY CÉLRA
 * VALÓ ALKALMAZHATÓSÁGRA való származtatott garanciát is beleértve.
 * További részleteket a GNU General Public License tartalmaz.
 *
 * A felhasználónak a programmal együtt meg kell kapnia a GNU General
 * Public License egy példányát; ha mégsem kapta meg, akkor
 * tekintse meg a <http://www.gnu.org/licenses/> oldalon.
 *
 * Version history:
 *
 * 0.0.1, 2013.szept.29.
 */
package batfai.samuentropy.brainboard7;
import android.util.Log;

/**
 *
 * @author nbatfai
 */
public class NeuronGameActivity extends android.app.Activity {
    private static final String TAG = NeuronGameActivity.class.toString();
    private NorbironSurfaceView sv;
    //private StringBuffer sb;
    //private Integer alreadySaved;
    //private Integer alreadyInFile;

    @Override
    public void onCreate(android.os.Bundle savedInstanceState) {
        Log.d(TAG, "just create");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        sv = (NorbironSurfaceView) findViewById(R.id.sv);
        //sb=new StringBuffer();
        //alreadySaved=alreadyInFile=sv.loadOnCreate(sb);
        sv.loadOnCreate();
    }

    @Override
    protected void onPause()
    {
      super.onPause();
      sv.saveOnPause();
    }

    /*@Override
    protected void onResume()
    {
        super.onResume();
        sv.loadOnContinue(sb);
    }*/

    /*@Override
    protected void onDestroy()
    {
        super.onDestroy();
        sv.saveOnDestroy();
    }*/
}