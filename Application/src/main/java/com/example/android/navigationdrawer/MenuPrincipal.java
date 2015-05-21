package com.example.android.navigationdrawer;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by Florian on 15/05/2015.
 */
    public class MenuPrincipal extends Fragment  { // implements View.OnClickListener à remettre au retour de onClickListener
    /*
    déclaration des boutons
     */
    private Button incontournables;
    private Button patesFarinesCereales;
    private Button viandePoissons;
    private Button produitsLaitiers;
    private Button fruitlegumes;


    public static final String PATES_FARINE_CEREALE="zlisproduction.finistonassiette.selectionaliments.PATES_FARINE_CEREALE";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       //  FragmentActivity    faActivity  = (FragmentActivity)    super.getActivity(); !!!!!!!!! A BANNIR !!!!!!!!!!
        // Replace LinearLayout by the type of the root element of the layout you're trying to load
        View llLayout =   inflater.inflate(R.layout.menu_principal_layout, container, false);

        incontournables=(Button) llLayout.findViewById(R.id.incontournable);
        // incontournables.setOnClickListener(this);
        patesFarinesCereales=(Button) llLayout.findViewById(R.id.PatesFarinesCereales);
        // patesFarinesCereales.setOnClickListener(this);
        viandePoissons=(Button) llLayout.findViewById(R.id.viandePoissons);
       //  viandePoissons.setOnClickListener(this);
        produitsLaitiers=(Button) llLayout.findViewById(R.id.produitsLaitiers);
        // produitsLaitiers.setOnClickListener(this);
        fruitlegumes=(Button) llLayout.findViewById((R.id.fruitlegumes));
       // fruitlegumes.setOnClickListener(this);

        // Don't use this method, it's handled by inflater.inflate() above :
        // setContentView(R.layout.activity_layout);

        return llLayout; // We must return the loaded Layout
    }

   /* @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal_layout);

        incontournables=(Button)findViewById(R.id.incontournable);
        incontournables.setOnClickListener(this);
        patesFarinesCereales=(Button)findViewById(R.id.PatesFarinesCereales);
        patesFarinesCereales.setOnClickListener(this);
        viandePoissons=(Button)findViewById(R.id.viandePoissons);
        viandePoissons.setOnClickListener(this);
        produitsLaitiers=(Button)findViewById(R.id.produitsLaitiers);
        produitsLaitiers.setOnClickListener(this);
        fruitlegumes=(Button)findViewById((R.id.fruitlegumes));
        fruitlegumes.setOnClickListener(this);

    }
    */

 /*   @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.incontournable:
                Intent activiteIncontournable= new Intent(super.getActivity(),Incontournable.class);
                startActivity(activiteIncontournable);


                break;
            case R.id.PatesFarinesCereales:

                Intent activitePatesFarineCereales= new Intent(super.getActivity(),PatesFarinesCereales.class);
                startActivity(activitePatesFarineCereales);

                break;
            case R.id.viandePoissons:

                Intent activiteviandepoisson= new Intent(super.getActivity(),ViandePoisson.class);
                startActivity(activiteviandepoisson);

                break;
            case R.id.produitsLaitiers:

                Intent activiteProduitsLaitiers = new Intent(super.getActivity(),ProduitLaitier.class);
                startActivity(activiteProduitsLaitiers);

                break;
            case R.id.fruitlegumes:
                Intent activiteFruitsLegumes= new Intent(super.getActivity(),ProduitLaitier.class);
                startActivity(activiteFruitsLegumes);

                break;
        }
    }
*/
}
