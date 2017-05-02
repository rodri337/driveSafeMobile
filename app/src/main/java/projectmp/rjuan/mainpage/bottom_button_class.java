package projectmp.rjuan.mainpage;

//import the correct packages for fragments
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rjuan on 4/27/2017.
 */

//dont forget to extends fragment (reuse)
public class bottom_button_class extends Fragment{

    //overide method


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        //inflate
        View view = inflater.inflate(R.layout.bottom_button_fragment, container, false);
        return view;
    }




}
