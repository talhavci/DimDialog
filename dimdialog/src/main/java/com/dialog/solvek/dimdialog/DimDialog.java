package com.dialog.solvek.dimdialog;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DimDialog{
    private TextView tvTitle, tvMessage;
    private Button btnNormal, btnPositive,
            btnNegative;
    private ImageView ivIcon;
    private DimDialogClickListener normalListener
            ,negativeListener, positiveListener;
    private Dialog dialog;
    private Activity activity;
    public DimDialog(Activity activity) {
        this.activity = activity;
        dialog=new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setContentView(R.layout.dimdialog);

        tvTitle = (TextView) dialog.findViewById(R.id.tvDimDialogTitle);
        tvMessage = (TextView) dialog.findViewById(R.id.tvDimDialogMessage);
        btnPositive = (Button) dialog.findViewById(R.id.btnDimDialogPositive);
        btnNegative = (Button) dialog.findViewById(R.id.btnDimDialogNegative);
        btnNormal = (Button) dialog.findViewById(R.id.btnDimDialogNormal);
        ivIcon = (ImageView) dialog.findViewById(R.id.ivDimDialogIcon);
    }

    public DimDialog setIcon(DimDialogIcon icon){
        ivIcon.setImageResource(icon.id());
        return this;
    }

    public DimDialog setCancelable(boolean isCancelable){
        dialog.setCancelable(isCancelable);
        return this;
    }

    public DimDialog setTitle(String title){
        tvTitle.setText(title);
        return this;
    }

    public DimDialog setTitleSize(float size){
        tvTitle.setTextSize(size);
        return this;
    }

    public DimDialog setMessageSize(float size){
        tvMessage.setTextSize(size);
        return this;
    }

    public DimDialog setMessage(String message){
        tvMessage.setText(message);
        return this;
    }

    public DimDialog setTitleFont(Typeface typeface){
        tvTitle.setTypeface(typeface);
        return this;
    }

    public DimDialog setMessageFont(Typeface typeface){
        tvMessage.setTypeface(typeface);
        return this;
    }

    public DimDialog setButtonPositiveListener(String btnText, DimDialogClickListener btnPositiveListener){
        positiveListener = btnPositiveListener;
        btnPositive.setText(btnText);

        if(positiveListener != null){
            btnPositive.setVisibility(View.VISIBLE);
            btnPositive.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    positiveListener.onClick();
                    dialog.dismiss();
                }
            });
        }
        return this;
    }

    public DimDialog setButtonNegativeListener(String btnText, DimDialogClickListener btnNegativeListener){
        negativeListener = btnNegativeListener;
        btnNegative.setText(btnText);

        if(negativeListener != null){
            btnNegative.setVisibility(View.VISIBLE);
            btnNegative.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    negativeListener.onClick();
                    dialog.dismiss();
                }
            });
        }
        return this;
    }

    public DimDialog setButtonNormalListener(String btnText, DimDialogClickListener btnNormalListener){
        normalListener = btnNormalListener;
        btnNormal.setText(btnText);

        if(normalListener != null){
            btnNormal.setVisibility(View.VISIBLE);
            btnNormal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    normalListener.onClick();
                    dialog.dismiss();
                }
            });
        }
        return this;
    }

    public DimDialog setButtonsFont(Typeface typeface){
        btnNormal.setTypeface(typeface);
        btnNegative.setTypeface(typeface);
        btnPositive.setTypeface(typeface);
        return this;
    }

    public DimDialog setNormalButtonColor(int color){
        if(color!=0)
        {
            GradientDrawable bg = (GradientDrawable)btnNormal.getBackground();
            bg.setColor(ContextCompat.getColor(activity, color));
        }
        return this;
    }

    public DimDialog setNegativeButtonColor(int color){
        if(color!=0)
        {
            GradientDrawable bg = (GradientDrawable)btnNegative.getBackground();
            bg.setColor(ContextCompat.getColor(activity, color));
        }
        return this;
    }

    public DimDialog setPositiveButtonColor(int color){
        if(color!=0)
        {
            GradientDrawable bg = (GradientDrawable)btnPositive.getBackground();
            bg.setColor(ContextCompat.getColor(activity, color));
        }
        return this;
    }

    public void show(){
        dialog.show();
    }
}
