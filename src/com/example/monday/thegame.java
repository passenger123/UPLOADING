package com.example.monday;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class thegame extends Activity
{
	private ImageView myImageView00;
	private ImageView myImageView01;
	private ImageView myImageView02;
	private ImageView myImageView03;
	private ImageView myImageView04;
	private ImageView myImageView05;
	private ImageView myImageView06;
	private ImageView myImageView07;
	private ImageView myImageView08;
	private Button mybutton;
	private TextView mScore;
	private int a = 8;
	private int[] myImage =
	{ R.drawable.p11, R.drawable.p02, R.drawable.p03, R.drawable.p05,
			R.drawable.p06, R.drawable.p07, R.drawable.p08, R.drawable.p09,
			R.drawable.p10, };
	private View.OnClickListener MyimageClistener;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.thegame1);
		myImageView00 = (ImageView) findViewById(R.id.mImage01);
		myImageView01 = (ImageView) findViewById(R.id.mImage02);
		myImageView02 = (ImageView) findViewById(R.id.mImage03);
		myImageView03 = (ImageView) findViewById(R.id.mImage04);
		myImageView04 = (ImageView) findViewById(R.id.mImage05);
		myImageView05 = (ImageView) findViewById(R.id.mImage06);
		myImageView06 = (ImageView) findViewById(R.id.mImage07);
		myImageView07 = (ImageView) findViewById(R.id.mImage08);
		myImageView08 = (ImageView) findViewById(R.id.mImage09);
		mybutton = (Button) findViewById(R.id.mButton);
		mScore = (TextView) findViewById(R.id.mScore);

		// 初始化卡片背景
		minit();
		/* MyimageClistener= */
		MyimageClistener = new View.OnClickListener()
		{

			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub

				switch (v.getId())
				{

				case R.id.mImage01:
					SetImage(0, myImageView00);
					break;
				case R.id.mImage02:
					SetImage(1, myImageView01);
					break;
				case R.id.mImage03:
					SetImage(2, myImageView02);
					break;
				case R.id.mImage04:
					SetImage(3, myImageView03);
					break;
				case R.id.mImage05:
					SetImage(4, myImageView04);
					break;
				case R.id.mImage06:
					SetImage(5, myImageView05);
					break;
				case R.id.mImage07:
					SetImage(6, myImageView06);
					break;
				case R.id.mImage08:
					SetImage(7, myImageView07);
					break;
				case R.id.mImage09:
					SetImage(8, myImageView08);
					break;
				default:
					break;
				}
			}

		};

		myImageView00.setOnClickListener(MyimageClistener);
		myImageView01.setOnClickListener(MyimageClistener);
		myImageView02.setOnClickListener(MyimageClistener);
		myImageView03.setOnClickListener(MyimageClistener);
		myImageView04.setOnClickListener(MyimageClistener);
		myImageView05.setOnClickListener(MyimageClistener);
		myImageView06.setOnClickListener(MyimageClistener);
		myImageView07.setOnClickListener(MyimageClistener);
		myImageView08.setOnClickListener(MyimageClistener);

		mybutton.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				// Toast.makeText(thegame.this, "a="+a,
				// Toast.LENGTH_SHORT).show();
				minit();
				a = 8;
				// Toast.makeText(thegame.this, "a="+a,
				// Toast.LENGTH_SHORT).show();
				// java.lang.System.out.print(a);
			}
		});

	}

	@SuppressLint("NewApi")
	private void minit()
	{
		myImageView00.setImageResource(R.drawable.p04);
		myImageView01.setImageResource(R.drawable.p04);
		myImageView02.setImageResource(R.drawable.p04);
		myImageView03.setImageResource(R.drawable.p04);
		myImageView04.setImageResource(R.drawable.p04);
		myImageView05.setImageResource(R.drawable.p04);
		myImageView06.setImageResource(R.drawable.p04);
		myImageView07.setImageResource(R.drawable.p04);
		myImageView08.setImageResource(R.drawable.p04);
		myImageView00.setImageAlpha(100);
		myImageView01.setImageAlpha(100);
		myImageView02.setImageAlpha(100);
		myImageView03.setImageAlpha(100);
		myImageView04.setImageAlpha(100);
		myImageView05.setImageAlpha(100);
		myImageView06.setImageAlpha(100);
		myImageView07.setImageAlpha(100);
		myImageView08.setImageAlpha(100);
		Randon();

	}

	@SuppressLint("NewApi")
	@SuppressWarnings("deprecation")
	private void SetImage(int temp, ImageView ss)
	{

		if (ss.getImageAlpha() == 100)
		{

			ss.setImageResource(myImage[temp]);
			ss.setImageAlpha(255);
			if (myImage[temp] == R.drawable.p11)
			{
				// Toast.makeText(thegame.this, "恭喜你猜對了!\n得分为："+a,
				// Toast.LENGTH_SHORT).show();
				mScore.setText("恭喜你猜对了！\n得分为：" + a);
				mScore.setTextColor(Color.GREEN);
			} else
			{
				// Toast.makeText(thegame.this, "對不起你猜錯了",
				// Toast.LENGTH_SHORT).show();
				mScore.setText("很遗憾，你猜错了");
				mScore.setTextColor(Color.RED);
			}

			a--;
		} else
		{
			// Toast.makeText(thegame.this, "你已经翻开了这张卡片！",
			// Toast.LENGTH_SHORT).show();
			mScore.setText("你已经翻开了这张卡片！");
			mScore.setTextColor(Color.RED);
		}
	}

	private void Randon()
	{
		for (int i = 0; i < myImage.length; i++)
		{
			int temp = myImage[i];
			int s = (int) (Math.random() * 2);
			myImage[i] = myImage[s];
			myImage[s] = temp;
		}
		// TODO Auto-generated method stub

	}

}
