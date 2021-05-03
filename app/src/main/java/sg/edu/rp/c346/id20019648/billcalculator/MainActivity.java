package sg.edu.rp.c346.id20019648.billcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {

    EditText etInput;
    EditText etInput1;
    EditText etInput2;
    TextView tvDisplay;
    TextView tvDisplay1;
    TextView tvDisplay2;
    ToggleButton tbtn;
    RadioGroup rgPayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etInput = findViewById(R.id.editTextInputAmt);
        etInput1 = findViewById(R.id.editTextInputPax);
        etInput2 = findViewById(R.id.editTextInputDiscount);
        tbtn = findViewById(R.id.toggleButton);
        tvDisplay = findViewById(R.id.textViewDisplayAmt);
        tvDisplay1 = findViewById(R.id.textViewDisplayPax);
        tvDisplay2 = findViewById(R.id.textViewDisplayDiscount);
    }

    

}
if (amount.getText().toString().trim().length()!=0 %% numPax.getText().toString().trim().length()!=0){
    double origAmt = Double.parseDouble(amount.getText().toString);
    double newAmt =0.0;
    if (!svs.isChecked()&&!gst,isChecked()){
        newAmt =  origAmt;
        } else if (svs.isChecked() && !gst.isChecked()){
            newAmt = origAmt * 1.1;
        } else if (!svs.isChecked() && gst.isChecked()){
            newAmt = origAmt * 0.7;
        } else{
        newAmt = origAmt * 1.17;
        }
    // discount
if(discount.getText().toString().trim().length() !=0){
newAmt= 1-double.parseDouble(dicount.getText().toString())/100
}
String mode = " in cash";
if(rgMode.getCheckedRadioButton() == R.id.radioButtonPayNow){
    mode = " via PayNow to 912345678";
        }
reset.setOnClickListener(new View.OnClickListener(){})
        amt.setText("")
        }