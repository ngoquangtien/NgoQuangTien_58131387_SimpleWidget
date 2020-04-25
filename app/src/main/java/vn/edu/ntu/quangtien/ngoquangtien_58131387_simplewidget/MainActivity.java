package vn.edu.ntu.quangtien.ngoquangtien_58131387_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Context context;
    EditText editname,editbirth,STK;
    Button button;
    RadioButton radmale,radfemale;
    CheckBox chechBox,chechBox2,chechBox3,chechBox4,chechBox5;
    RadioGroup rdgSex,sothich;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        connectView();
        addevent();
    }




    private void connectView() {
        editname = findViewById(R.id.editname);
        editbirth = findViewById(R.id.editbirth);
        radfemale = findViewById(R.id.radfemale);
        radmale = findViewById(R.id.radmale);
        chechBox = findViewById(R.id.checkBox);
        chechBox2 = findViewById(R.id.checkBox2);
        chechBox3 = findViewById(R.id.checkBox3);
        chechBox4 = findViewById(R.id.checkBox4);
        chechBox5 = findViewById(R.id.checkBox5);
        button = findViewById(R.id.button);
        rdgSex = findViewById(R.id.rdgSex);
        sothich = findViewById(R.id.sothich);
        STK = findViewById(R.id.STK);
    }
    private void addevent() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               ok(); 
            }
        });
    }
    public void ok(){
        String name= editname.getText().toString().trim();
        String birth= editbirth.getText().toString().trim();
        String sothichkhac = STK.getText().toString().trim();
        String result = null;
        if(name.length()>0)
//            Toast.makeText(context,"Tên : "+name,Toast.LENGTH_SHORT).show();
            result= "Tên : "+name +" \n ";
        if (birth.length()>0)
//            Toast.makeText(context,"Ngày sinh : "+birth,Toast.LENGTH_SHORT).show();
            result += "Ngày sinh : "+birth+"\n";
        switch (rdgSex.getCheckedRadioButtonId()){
            case R.id.radmale:
                result += "Giới tính : Nam \n Sở thích : ";
                break;
            case R.id.radfemale:
                result += "Giới tính : Nữ \n Sở thích : ";
                break;
        }
        if(chechBox.isChecked())
            result +=chechBox.getText()+", ";
        if(chechBox2.isChecked())
            result +=chechBox2.getText()+", ";
        if(chechBox3.isChecked())
            result +=chechBox3.getText()+", ";
        if(chechBox4.isChecked())
            result +=chechBox4.getText()+", ";
        if(chechBox5.isChecked())
            result +=chechBox5.getText()+", ";
        if(sothichkhac.length()>0)
            result += sothichkhac;
        Toast.makeText(context,result,Toast.LENGTH_SHORT).show();
    }

}
