package com.example.quotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.quotes.databinding.ActivityHomePageBinding;
import com.example.quotes.databinding.ActivityQuotesBinding;

import java.util.ArrayList;

public class QuotesActivity extends AppCompatActivity {

    Button btnCopy;
    ActivityQuotesBinding binding;
    RecyclerView DiaplayQuotesRecycler;


    ArrayList<DisplayQuotesModal> DisplayQuotes = new ArrayList<>();
    ArrayList<DisplayQuotesModal> BackgroundImage = new ArrayList<>();


  String catogeryName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityQuotesBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        
        initview();
    }

    private void initview() {
        if(getIntent()!=null)
        {
             catogeryName = getIntent().getStringExtra("title");
            binding.Quotes.setText(catogeryName);
        }

        if (catogeryName.equals("Good Morning")) {
            DisplayQuotesModal q1 = new DisplayQuotesModal();
            q1.setDisplayQuotes("Good morning! Embrace the day with a smile.");
            q1.setBackgroundImage(R.drawable.gdr1);
            DisplayQuotes.add(q1);
            BackgroundImage.add(q1);

            DisplayQuotesModal a2 = new DisplayQuotesModal();
            a2.setDisplayQuotes("Sunrise hugs, hope tugs.");
            a2.setBackgroundImage(R.drawable.grd2);
            DisplayQuotes.add(a2);
            BackgroundImage.add(a2);

            DisplayQuotesModal q3 = new DisplayQuotesModal();
            q3.setDisplayQuotes("Dawn's grace, embrace the chase.");
            q3.setBackgroundImage(R.drawable.gdr10);
            DisplayQuotes.add(q3);
            BackgroundImage.add(q3);

            DisplayQuotesModal q4 = new DisplayQuotesModal();
            q4.setDisplayQuotes("Wake up, sparkle, be a miracle.");
            q4.setBackgroundImage(R.drawable.grd4);
            DisplayQuotes.add(q4);
            BackgroundImage.add(q4);

            DisplayQuotesModal q5 = new DisplayQuotesModal();
            q5.setDisplayQuotes("Sun salutes, life reboots.");
            q5.setBackgroundImage(R.drawable.gdr5);
            DisplayQuotes.add(q5);
            BackgroundImage.add(q5);

            DisplayQuotesModal q6 = new DisplayQuotesModal();
            q6.setDisplayQuotes("Coffee's call, conquer all.");
            q6.setBackgroundImage(R.drawable.gdr6);
            DisplayQuotes.add(q6);
            BackgroundImage.add(q6);

            DisplayQuotesModal q7 = new DisplayQuotesModal();
            q7.setDisplayQuotes("Daybreak dreams, endless themes.");
            q7.setBackgroundImage(R.drawable.gdr7);
            DisplayQuotes.add(q7);
            BackgroundImage.add(q7);

            DisplayQuotesModal q8 = new DisplayQuotesModal();
            q8.setDisplayQuotes("Sky's cheer, conquer fear.");
            q8.setBackgroundImage(R.drawable.gdr8);
            DisplayQuotes.add(q8);
            BackgroundImage.add(q1);

            DisplayQuotesModal q9 = new DisplayQuotesModal();
            q9.setDisplayQuotes("Sunrise whispers, endless adventures.");
            q9.setBackgroundImage(R.drawable.gdr9);
            DisplayQuotes.add(q9);
            BackgroundImage.add(q9);

            DisplayQuotesModal q10 = new DisplayQuotesModal();
            q10.setDisplayQuotes("Gratitude blooms, chase your dreams.");
            q10.setBackgroundImage(R.drawable.grd3);
            DisplayQuotes.add(q10);
            BackgroundImage.add(q10);


        }




         else if (catogeryName.equals("Good Night")) {
            DisplayQuotesModal q1 = new DisplayQuotesModal();
            q1.setDisplayQuotes("Nighttime falls, dreams call.");
            q1.setBackgroundImage(R.drawable.gdr1);
            DisplayQuotes.add(q1);
            BackgroundImage.add(q1);

            DisplayQuotesModal q2 = new DisplayQuotesModal();
            q2.setDisplayQuotes("Moonlight gleams, sleep in dreams.");
            q2.setBackgroundImage(R.drawable.grd2);
            DisplayQuotes.add(q2);
            BackgroundImage.add(q2);

            DisplayQuotesModal q3 = new DisplayQuotesModal();
            q3.setDisplayQuotes("Stars align, good night's sign.");
            q3.setBackgroundImage(R.drawable.gdr10);
            DisplayQuotes.add(q3);
            BackgroundImage.add(q3);

            DisplayQuotesModal q4 = new DisplayQuotesModal();
            q4.setDisplayQuotes("Close your eyes, let worries fly.");
            q4.setBackgroundImage(R.drawable.grd4);
            DisplayQuotes.add(q4);
            BackgroundImage.add(q4);

            DisplayQuotesModal q5 = new DisplayQuotesModal();
            q5.setDisplayQuotes("Moon's embrace, find your peace.");
            q5.setBackgroundImage(R.drawable.gdr5);
            DisplayQuotes.add(q5);
            BackgroundImage.add(q5);

            DisplayQuotesModal q6 = new DisplayQuotesModal();
            q6.setDisplayQuotes("Restful night, stars in sight.");
            q6.setBackgroundImage(R.drawable.gdr6);
            DisplayQuotes.add(q6);
            BackgroundImage.add(q6);

            DisplayQuotesModal q7 = new DisplayQuotesModal();
            q7.setDisplayQuotes("Silent night, sleep tight.");
            q7.setBackgroundImage(R.drawable.gdr7);
            DisplayQuotes.add(q7);
            BackgroundImage.add(q7);

            DisplayQuotesModal q8 = new DisplayQuotesModal();
            q8.setDisplayQuotes("Sky's cheer, conquer fear. (Good Night)");
            q8.setBackgroundImage(R.drawable.gdr8);
            DisplayQuotes.add(q8);
            BackgroundImage.add(q8);

            DisplayQuotesModal q9 = new DisplayQuotesModal();
            q9.setDisplayQuotes("Sunrise whispers, endless adventures.");
            q9.setBackgroundImage(R.drawable.gdr9);
            DisplayQuotes.add(q9);
            BackgroundImage.add(q9);

            DisplayQuotesModal q10 = new DisplayQuotesModal();
            q10.setDisplayQuotes("Gratitude blooms, chase your dreams.");
            q10.setBackgroundImage(R.drawable.grd3);
            DisplayQuotes.add(q10);
            BackgroundImage.add(q10);
        }

        else if (catogeryName.equals("Love")) {
            DisplayQuotesModal l1 = new DisplayQuotesModal();
            l1.setDisplayQuotes("Love is the poetry of the senses.");
            l1.setBackgroundImage(R.drawable.gdr1);
            DisplayQuotes.add(l1);
            BackgroundImage.add(l1);

            DisplayQuotesModal l2 = new DisplayQuotesModal();
            l2.setDisplayQuotes("In your eyes, I find my favorite reflection.");
            l2.setBackgroundImage(R.drawable.grd2);
            DisplayQuotes.add(l2);
            BackgroundImage.add(l2);

            DisplayQuotesModal l3 = new DisplayQuotesModal();
            l3.setDisplayQuotes("Love grows in the garden of patience.");
            l3.setBackgroundImage(R.drawable.gdr10);
            DisplayQuotes.add(l3);
            BackgroundImage.add(l3);

            DisplayQuotesModal l4 = new DisplayQuotesModal();
            l4.setDisplayQuotes("You're the reason for my smile, the love in my mile.");
            l4.setBackgroundImage(R.drawable.grd4);
            DisplayQuotes.add(l4);
            BackgroundImage.add(l4);

            DisplayQuotesModal l5 = new DisplayQuotesModal();
            l5.setDisplayQuotes("Together is a wonderful place to be.");
            l5.setBackgroundImage(R.drawable.gdr5);
            DisplayQuotes.add(l5);
            BackgroundImage.add(l5);

            DisplayQuotesModal l6 = new DisplayQuotesModal();
            l6.setDisplayQuotes("In your arms, I've found my forever home.");
            l6.setBackgroundImage(R.drawable.gdr6);
            DisplayQuotes.add(l6);
            BackgroundImage.add(l6);

            DisplayQuotesModal l7 = new DisplayQuotesModal();
            l7.setDisplayQuotes("Love is not just a feeling; it's an action.");
            l7.setBackgroundImage(R.drawable.gdr7);
            DisplayQuotes.add(l7);
            BackgroundImage.add(l7);

            DisplayQuotesModal l8 = new DisplayQuotesModal();
            l8.setDisplayQuotes("Sky's cheer, conquer fear. (Love)");
            l8.setBackgroundImage(R.drawable.gdr8);
            DisplayQuotes.add(l8);
            BackgroundImage.add(l8);

            DisplayQuotesModal l9 = new DisplayQuotesModal();
            l9.setDisplayQuotes("Love is the bridge between hearts.");
            l9.setBackgroundImage(R.drawable.gdr9);
            DisplayQuotes.add(l9);
            BackgroundImage.add(l9);

            DisplayQuotesModal l10 = new DisplayQuotesModal();
            l10.setDisplayQuotes("In your love, I've found my safe haven.");
            l10.setBackgroundImage(R.drawable.grd3);
            DisplayQuotes.add(l10);
            BackgroundImage.add(l10);
        }


        else if (catogeryName.equals("Attitude")) {
            DisplayQuotesModal a1 = new DisplayQuotesModal();
            a1.setDisplayQuotes("My attitude is a reflection of my style.");
            a1.setBackgroundImage(R.drawable.gdr1);
            DisplayQuotes.add(a1);
            BackgroundImage.add(a1);

            DisplayQuotesModal a2 = new DisplayQuotesModal();
            a2.setDisplayQuotes("Silence speaks louder than words; my attitude roars.");
            a2.setBackgroundImage(R.drawable.grd2);
            DisplayQuotes.add(a2);
            BackgroundImage.add(a2);

            DisplayQuotesModal a3 = new DisplayQuotesModal();
            a3.setDisplayQuotes("I'm not perfect, but my attitude is on point.");
            a3.setBackgroundImage(R.drawable.gdr10);
            DisplayQuotes.add(a3);
            BackgroundImage.add(a3);

            DisplayQuotesModal a4 = new DisplayQuotesModal();
            a4.setDisplayQuotes("Confidence is silent, insecurities are loud—meet my attitude.");
            a4.setBackgroundImage(R.drawable.grd4);
            DisplayQuotes.add(a4);
            BackgroundImage.add(a4);

            DisplayQuotesModal a5 = new DisplayQuotesModal();
            a5.setDisplayQuotes("I don't have an attitude problem; you just can't handle my personality.");
            a5.setBackgroundImage(R.drawable.gdr5);
            DisplayQuotes.add(a5);
            BackgroundImage.add(a5);

            DisplayQuotesModal a6 = new DisplayQuotesModal();
            a6.setDisplayQuotes("Born to stand out, my attitude shouts.");
            a6.setBackgroundImage(R.drawable.gdr6);
            DisplayQuotes.add(a6);
            BackgroundImage.add(a6);

            DisplayQuotesModal a7 = new DisplayQuotesModal();
            a7.setDisplayQuotes("I'm not anti-social; I'm selectively social. That's my attitude.");
            a7.setBackgroundImage(R.drawable.gdr7);
            DisplayQuotes.add(a7);
            BackgroundImage.add(a7);

            DisplayQuotesModal a8 = new DisplayQuotesModal();
            a8.setDisplayQuotes("Sky's cheer, conquer fear. (Attitude)");
            a8.setBackgroundImage(R.drawable.gdr8);
            DisplayQuotes.add(a8);
            BackgroundImage.add(a8);

            DisplayQuotesModal a9 = new DisplayQuotesModal();
            a9.setDisplayQuotes("Haters will broadcast your failures, but whisper your success—fuel for my attitude.");
            a9.setBackgroundImage(R.drawable.gdr9);
            DisplayQuotes.add(a9);
            BackgroundImage.add(a9);

            DisplayQuotesModal a10 = new DisplayQuotesModal();
            a10.setDisplayQuotes("I'm not a second option; either choose me or lose me—my attitude, my rules.");
            a10.setBackgroundImage(R.drawable.grd3);
            DisplayQuotes.add(a10);
            BackgroundImage.add(a10);
        }

        else if (catogeryName.equals("RelationShip")) {
            DisplayQuotesModal r1 = new DisplayQuotesModal();
            r1.setDisplayQuotes("In every relationship, honesty and communication are key.");
            r1.setBackgroundImage(R.drawable.gdr1);
            DisplayQuotes.add(r1);
            BackgroundImage.add(r1);

            DisplayQuotesModal r2 = new DisplayQuotesModal();
            r2.setDisplayQuotes("A strong relationship requires choosing to love each other even in those moments when you struggle to like each other.");
            r2.setBackgroundImage(R.drawable.gdr9);
            DisplayQuotes.add(r2);
            BackgroundImage.add(r2);

            DisplayQuotesModal r3 = new DisplayQuotesModal();
            r3.setDisplayQuotes("Love is the master key that opens the gates of happiness.");
            r3.setBackgroundImage(R.drawable.gdr10);
            DisplayQuotes.add(r3);
            BackgroundImage.add(r3);

            DisplayQuotesModal r4 = new DisplayQuotesModal();
            r4.setDisplayQuotes("A successful relationship is built on trust and mutual respect.");
            r4.setBackgroundImage(R.drawable.grd4);
            DisplayQuotes.add(r4);
            BackgroundImage.add(r4);

            DisplayQuotesModal r5 = new DisplayQuotesModal();
            r5.setDisplayQuotes("Couples that laugh together, last together.");
            r5.setBackgroundImage(R.drawable.gdr5);
            DisplayQuotes.add(r5);
            BackgroundImage.add(r5);

            DisplayQuotesModal r6 = new DisplayQuotesModal();
            r6.setDisplayQuotes("A great relationship is about two things: appreciating the similarities and respecting the differences.");
            r6.setBackgroundImage(R.drawable.gdr6);
            DisplayQuotes.add(r6);
            BackgroundImage.add(r6);

            DisplayQuotesModal r7 = new DisplayQuotesModal();
            r7.setDisplayQuotes("The best relationships are the ones you never saw coming.");
            r7.setBackgroundImage(R.drawable.gdr7);
            DisplayQuotes.add(r7);
            BackgroundImage.add(r7);

            DisplayQuotesModal r8 = new DisplayQuotesModal();
            r8.setDisplayQuotes("A true relationship is two imperfect people refusing to give up on each other.");
            r8.setBackgroundImage(R.drawable.gdr8);
            DisplayQuotes.add(r8);
            BackgroundImage.add(r8);

            DisplayQuotesModal r9 =  new DisplayQuotesModal();
            r9.setDisplayQuotes("A successful marriage requires falling in love many times, always with the same person.");
            r9.setBackgroundImage(R.drawable.gdr9);
            DisplayQuotes.add(r9);
            BackgroundImage.add(r9);

            DisplayQuotesModal r10 = new DisplayQuotesModal();
            r10.setDisplayQuotes("The best love is the one that makes you a better person without changing you into someone other than yourself.");
            r10.setBackgroundImage(R.drawable.grd3);
            DisplayQuotes.add(r10);
            BackgroundImage.add(r10);
        }

        else  if (catogeryName.equals("Life")) {
            DisplayQuotesModal l1 = new DisplayQuotesModal();
            l1.setDisplayQuotes("Life is a journey that must be traveled no matter how bad the roads and accommodations.");
            l1.setBackgroundImage(R.drawable.gdr1);
            DisplayQuotes.add(l1);
            BackgroundImage.add(l1);

            DisplayQuotesModal l2 = new DisplayQuotesModal();
            l2.setDisplayQuotes("Life is 10% what happens to us and 90% how we react to it.");
            l2.setBackgroundImage(R.drawable.gdr9);
            DisplayQuotes.add(l2);
            BackgroundImage.add(l2);

            DisplayQuotesModal l3 = new DisplayQuotesModal();
            l3.setDisplayQuotes("Life is what happens when you're busy making other plans.");
            l3.setBackgroundImage(R.drawable.gdr10);
            DisplayQuotes.add(l3);
            BackgroundImage.add(l3);

            DisplayQuotesModal l4 = new DisplayQuotesModal();
            l4.setDisplayQuotes("Life is really simple, but we insist on making it complicated.");
            l4.setBackgroundImage(R.drawable.grd4);
            DisplayQuotes.add(l4);
            BackgroundImage.add(l4);

            DisplayQuotesModal l5 = new DisplayQuotesModal();
            l5.setDisplayQuotes("Life is short, and it's up to you to make it sweet.");
            l5.setBackgroundImage(R.drawable.gdr5);
            DisplayQuotes.add(l5);
            BackgroundImage.add(l5);

            DisplayQuotesModal l6 = new DisplayQuotesModal();
            l6.setDisplayQuotes("Life is a balance of holding on and letting go.");
            l6.setBackgroundImage(R.drawable.gdr6);
            DisplayQuotes.add(l6);
            BackgroundImage.add(l6);

            DisplayQuotesModal l7 = new DisplayQuotesModal();
            l7.setDisplayQuotes("In three words, I can sum up everything I've learned about life: it goes on.");
            l7.setBackgroundImage(R.drawable.gdr7);
            DisplayQuotes.add(l7);
            BackgroundImage.add(l7);

            DisplayQuotesModal l8 = new DisplayQuotesModal();
            l8.setDisplayQuotes("Life is either a daring adventure or nothing at all.");
            l8.setBackgroundImage(R.drawable.gdr8);
            DisplayQuotes.add(l8);
            BackgroundImage.add(l8);

            DisplayQuotesModal l9 = new DisplayQuotesModal();
            l9.setDisplayQuotes("Life is short, and it's up to you to make it sweet.");
            l9.setBackgroundImage(R.drawable.gdr9);
            DisplayQuotes.add(l9);
            BackgroundImage.add(l9);

            DisplayQuotesModal l10 = new DisplayQuotesModal();
            l10.setDisplayQuotes("Life is what happens when you're busy making other plans.");
            l10.setBackgroundImage(R.drawable.grd3);
            DisplayQuotes.add(l10);
            BackgroundImage.add(l10);
        }

        else if (catogeryName.equals("Happy")) {
            DisplayQuotesModal h1 = new DisplayQuotesModal();
            h1.setDisplayQuotes("Happiness is not something ready made. It comes from your own actions.");
            h1.setBackgroundImage(R.drawable.gdr1);
            DisplayQuotes.add(h1);
            BackgroundImage.add(h1);

            DisplayQuotesModal h2 = new DisplayQuotesModal();
            h2.setDisplayQuotes("Happiness is a choice. Choose it every day.");
            h2.setBackgroundImage(R.drawable.gdr9);
            DisplayQuotes.add(h2);
            BackgroundImage.add(h2);

            DisplayQuotesModal h3 = new DisplayQuotesModal();
            h3.setDisplayQuotes("The secret to happiness is not in doing what one likes, but in liking what one does.");
            h3.setBackgroundImage(R.drawable.gdr10);
            DisplayQuotes.add(h3);
            BackgroundImage.add(h3);

            DisplayQuotesModal h4 = new DisplayQuotesModal();
            h4.setDisplayQuotes("The greatest happiness you can have is knowing that you do not necessarily require happiness.");
            h4.setBackgroundImage(R.drawable.grd4);
            DisplayQuotes.add(h4);
            BackgroundImage.add(h4);

            DisplayQuotesModal h5 = new DisplayQuotesModal();
            h5.setDisplayQuotes("Happiness is a state of mind. It's just according to the way you look at things.");
            h5.setBackgroundImage(R.drawable.gdr5);
            DisplayQuotes.add(h5);
            BackgroundImage.add(h5);

            DisplayQuotesModal h6 = new DisplayQuotesModal();
            h6.setDisplayQuotes("True happiness arises, in the first place, from the enjoyment of one's self.");
            h6.setBackgroundImage(R.drawable.gdr6);
            DisplayQuotes.add(h6);
            BackgroundImage.add(h6);

            DisplayQuotesModal h7 = new DisplayQuotesModal();
            h7.setDisplayQuotes("Happiness is when what you think, what you say, and what you do are in harmony.");
            h7.setBackgroundImage(R.drawable.gdr7);
            DisplayQuotes.add(h7);
            BackgroundImage.add(h7);

            DisplayQuotesModal h8 = new DisplayQuotesModal();
            h8.setDisplayQuotes("Happiness is not by chance, but by choice.");
            h8.setBackgroundImage(R.drawable.gdr8);
            DisplayQuotes.add(h8);
            BackgroundImage.add(h8);

            DisplayQuotesModal h9 = new DisplayQuotesModal();
            h9.setDisplayQuotes("Happiness is the art of never holding in your mind the memory of any unpleasant thing that has passed.");
            h9.setBackgroundImage(R.drawable.gdr9);
            DisplayQuotes.add(h9);
            BackgroundImage.add(h9);

            DisplayQuotesModal h10 = new DisplayQuotesModal();
            h10.setDisplayQuotes("The best way to cheer yourself is to try to cheer someone else up.");
            h10.setBackgroundImage(R.drawable.grd3);
            DisplayQuotes.add(h10);
            BackgroundImage.add(h10);
        }
        else if (catogeryName.equals("Sad")) {
            DisplayQuotesModal s1 = new DisplayQuotesModal();
            s1.setDisplayQuotes("The way sadness works is one of the strange riddles of the world. If you are stricken with a great sadness, you may feel as if you have been set aflame, not only because of the enormous pain but also because your sadness may spread over your life.");
            s1.setBackgroundImage(R.drawable.gdr1);
            DisplayQuotes.add(s1);
            BackgroundImage.add(s1);

            DisplayQuotesModal s2 = new DisplayQuotesModal();
            s2.setDisplayQuotes("Tears come from the heart and not from the brain.");
            s2.setBackgroundImage(R.drawable.gdr9);
            DisplayQuotes.add(s2);
            BackgroundImage.add(s2);

            DisplayQuotesModal s3 = new DisplayQuotesModal();
            s3.setDisplayQuotes("Sadness is but a wall between two gardens.");
            s3.setBackgroundImage(R.drawable.gdr10);
            DisplayQuotes.add(s3);
            BackgroundImage.add(s3);

            DisplayQuotesModal s4 = new DisplayQuotesModal();
            s4.setDisplayQuotes("Behind every sweet smile, there is a bitter sadness that no one can ever see and feel.");
            s4.setBackgroundImage(R.drawable.grd4);
            DisplayQuotes.add(s4);
            BackgroundImage.add(s4);

            DisplayQuotesModal s5 = new DisplayQuotesModal();
            s5.setDisplayQuotes("It's sad when someone you know becomes someone you knew.");
            s5.setBackgroundImage(R.drawable.gdr5);
            DisplayQuotes.add(s5);
            BackgroundImage.add(s5);

            DisplayQuotesModal s6 = new DisplayQuotesModal();
            s6.setDisplayQuotes("The walls we build around us to keep out the sadness also keep out the joy.");
            s6.setBackgroundImage(R.drawable.grd3); // Change the background image to gdr3
            DisplayQuotes.add(s6);
            BackgroundImage.add(s6);

            DisplayQuotesModal s7 = new DisplayQuotesModal();
            s7.setDisplayQuotes("The saddest thing about love is that not only the love cannot last forever, but even the heartbreak is soon forgotten.");
            s7.setBackgroundImage(R.drawable.gdr6); // Change the background image to gdr6
            DisplayQuotes.add(s7);
            BackgroundImage.add(s7);

            DisplayQuotesModal s8 = new DisplayQuotesModal();
            s8.setDisplayQuotes("It's so hard to forget pain, but it's even harder to remember sweetness. We have no scar to show for happiness. We learn so little from peace.");
            s8.setBackgroundImage(R.drawable.gdr8); // Change the background image to grd8
            DisplayQuotes.add(s8);
            BackgroundImage.add(s8);

            DisplayQuotesModal s9 = new DisplayQuotesModal();
            s9.setDisplayQuotes("The saddest thing is when you are feeling real down, you look around and realize that there is no shoulder for you.");
            s9.setBackgroundImage(R.drawable.gdr7); // Change the background image to gdr7
            DisplayQuotes.add(s9);
            BackgroundImage.add(s9);

            DisplayQuotesModal s10 = new DisplayQuotesModal();
            s10.setDisplayQuotes("It's sad when someone you know becomes someone you knew.");
            s10.setBackgroundImage(R.drawable.grd2); // Change the background image to gdr2
            DisplayQuotes.add(s10);
            BackgroundImage.add(s10);
        }

        else if (catogeryName.equals("Motivation")) {
            DisplayQuotesModal m1 = new DisplayQuotesModal();
            m1.setDisplayQuotes("Your only limit is you. Stay motivated!");
            m1.setBackgroundImage(R.drawable.gdr1);
            DisplayQuotes.add(m1);
            BackgroundImage.add(m1);

            DisplayQuotesModal m2 = new DisplayQuotesModal();
            m2.setDisplayQuotes("The only way to achieve the impossible is to believe it is possible.");
            m2.setBackgroundImage(R.drawable.gdr9);
            DisplayQuotes.add(m2);
            BackgroundImage.add(m2);

            DisplayQuotesModal m3 = new DisplayQuotesModal();
            m3.setDisplayQuotes("Success is not final, failure is not fatal: It is the courage to continue that counts.");
            m3.setBackgroundImage(R.drawable.gdr10);
            DisplayQuotes.add(m3);
            BackgroundImage.add(m3);

            DisplayQuotesModal m4 = new DisplayQuotesModal();
            m4.setDisplayQuotes("Believe in yourself and all that you are. Know that there is something inside you that is greater than any obstacle.");
            m4.setBackgroundImage(R.drawable.grd4);
            DisplayQuotes.add(m4);
            BackgroundImage.add(m4);

            DisplayQuotesModal m5 = new DisplayQuotesModal();
            m5.setDisplayQuotes("The only way to do great work is to love what you do.");
            m5.setBackgroundImage(R.drawable.gdr5);
            DisplayQuotes.add(m5);
            BackgroundImage.add(m5);

            DisplayQuotesModal m6 = new DisplayQuotesModal();
            m6.setDisplayQuotes("Your attitude, not your aptitude, will determine your altitude.");
            m6.setBackgroundImage(R.drawable.grd3); // Change the background image to gdr3
            DisplayQuotes.add(m6);
            BackgroundImage.add(m6);

            DisplayQuotesModal m7 = new DisplayQuotesModal();
            m7.setDisplayQuotes("The future belongs to those who believe in the beauty of their dreams.");
            m7.setBackgroundImage(R.drawable.gdr6); // Change the background image to gdr6
            DisplayQuotes.add(m7);
            BackgroundImage.add(m7);

            DisplayQuotesModal m8 = new DisplayQuotesModal();
            m8.setDisplayQuotes("Success is the sum of small efforts, repeated day in and day out.");
            m8.setBackgroundImage(R.drawable.gdr8); // Change the background image to grd8
            DisplayQuotes.add(m8);
            BackgroundImage.add(m8);

            DisplayQuotesModal m9 = new DisplayQuotesModal();
            m9.setDisplayQuotes("Don't watch the clock; do what it does. Keep going.");
            m9.setBackgroundImage(R.drawable.gdr7); // Change the background image to gdr7
            DisplayQuotes.add(m9);
            BackgroundImage.add(m9);

            DisplayQuotesModal m10 = new DisplayQuotesModal();
            m10.setDisplayQuotes("Success is not in what you have, but who you are.");
            m10.setBackgroundImage(R.drawable.grd2); // Change the background image to gdr2
            DisplayQuotes.add(m10);
            BackgroundImage.add(m10);
        }


        else  if (catogeryName.equals("Wife")) {
            DisplayQuotesModal w1 = new DisplayQuotesModal();
            w1.setDisplayQuotes("To my wonderful wife, you are the joy in my heart and the love of my life.");
            w1.setBackgroundImage(R.drawable.gdr1);
            DisplayQuotes.add(w1);
            BackgroundImage.add(w1);

            DisplayQuotesModal w2 = new DisplayQuotesModal();
            w2.setDisplayQuotes("In you, I found my forever love, my partner in crime, and my best friend.");
            w2.setBackgroundImage(R.drawable.gdr9);
            DisplayQuotes.add(w2);
            BackgroundImage.add(w2);

            DisplayQuotesModal w3 = new DisplayQuotesModal();
            w3.setDisplayQuotes("To my amazing wife, your love is my greatest treasure and my greatest strength.");
            w3.setBackgroundImage(R.drawable.gdr10);
            DisplayQuotes.add(w3);
            BackgroundImage.add(w3);

            DisplayQuotesModal w4 = new DisplayQuotesModal();
            w4.setDisplayQuotes("You are not just my wife, you are my everything. I am grateful for you every day.");
            w4.setBackgroundImage(R.drawable.grd4);
            DisplayQuotes.add(w4);
            BackgroundImage.add(w4);

            DisplayQuotesModal w5 = new DisplayQuotesModal();
            w5.setDisplayQuotes("With you, every moment is special, and every day is a celebration of our love.");
            w5.setBackgroundImage(R.drawable.gdr5);
            DisplayQuotes.add(w5);
            BackgroundImage.add(w5);

            DisplayQuotesModal w6 = new DisplayQuotesModal();
            w6.setDisplayQuotes("In your arms, I have found my home. Thank you for being my wife and my love.");
            w6.setBackgroundImage(R.drawable.grd3); // Change the background image to gdr3
            DisplayQuotes.add(w6);
            BackgroundImage.add(w6);

            DisplayQuotesModal w7 = new DisplayQuotesModal();
            w7.setDisplayQuotes("To my beautiful wife, you make every day brighter and every moment sweeter.");
            w7.setBackgroundImage(R.drawable.gdr6); // Change the background image to gdr6
            DisplayQuotes.add(w7);
            BackgroundImage.add(w7);

            DisplayQuotesModal w8 = new DisplayQuotesModal();
            w8.setDisplayQuotes("With you, life is an adventure, and every day is a journey of love.");
            w8.setBackgroundImage(R.drawable.gdr8); // Change the background image to grd8
            DisplayQuotes.add(w8);
            BackgroundImage.add(w8);

            DisplayQuotesModal w9 = new DisplayQuotesModal();
            w9.setDisplayQuotes("To my lovely wife, your love is the melody of my heart, and I cherish every note.");
            w9.setBackgroundImage(R.drawable.gdr7); // Change the background image to gdr7
            DisplayQuotes.add(w9);
            BackgroundImage.add(w9);

            DisplayQuotesModal w10 = new DisplayQuotesModal();
            w10.setDisplayQuotes("In your love, I have found my forever and always. I love you, my dear wife.");
            w10.setBackgroundImage(R.drawable.grd2); // Change the background image to gdr2
            DisplayQuotes.add(w10);
            BackgroundImage.add(w10);
        }

        else if (catogeryName.equals("Valentine Day")) {
            DisplayQuotesModal v1 = new DisplayQuotesModal();
            v1.setDisplayQuotes("Cherishing our love this Valentine's Day.");
            v1.setBackgroundImage(R.drawable.gdr1);
            DisplayQuotes.add(v1);
            BackgroundImage.add(v1);

            DisplayQuotesModal v2 = new DisplayQuotesModal();
            v2.setDisplayQuotes("Happy Valentine's Day, my heartbeat!");
            v2.setBackgroundImage(R.drawable.gdr9);
            DisplayQuotes.add(v2);
            BackgroundImage.add(v2);

            DisplayQuotesModal v3 = new DisplayQuotesModal();
            v3.setDisplayQuotes("To the one I love most, Happy Valentine's!");
            v3.setBackgroundImage(R.drawable.gdr10);
            DisplayQuotes.add(v3);
            BackgroundImage.add(v3);

            DisplayQuotesModal v4 = new DisplayQuotesModal();
            v4.setDisplayQuotes("Happy Valentine's, my love. You complete me.");
            v4.setBackgroundImage(R.drawable.grd4);
            DisplayQuotes.add(v4);
            BackgroundImage.add(v4);

            DisplayQuotesModal v5 = new DisplayQuotesModal();
            v5.setDisplayQuotes("You're my heart's key. Happy Valentine's!");
            v5.setBackgroundImage(R.drawable.gdr5);
            DisplayQuotes.add(v5);
            BackgroundImage.add(v5);

            DisplayQuotesModal v6 = new DisplayQuotesModal();
            v6.setDisplayQuotes("Grateful for us. Happy Valentine's Day!");
            v6.setBackgroundImage(R.drawable.grd3); // Change the background image to gdr3
            DisplayQuotes.add(v6);
            BackgroundImage.add(v6);

            DisplayQuotesModal v7 = new DisplayQuotesModal();
            v7.setDisplayQuotes("Happy Valentine's Day, my love. Special moments, memorable love.");
            v7.setBackgroundImage(R.drawable.gdr6); // Change the background image to gdr6
            DisplayQuotes.add(v7);
            BackgroundImage.add(v7);

            DisplayQuotesModal v8 = new DisplayQuotesModal();
            v8.setDisplayQuotes("You hold the key to my heart. Happy Valentine's!");
            v8.setBackgroundImage(R.drawable.gdr8); // Change the background image to grd8
            DisplayQuotes.add(v8);
            BackgroundImage.add(v8);

            DisplayQuotesModal v9 = new DisplayQuotesModal();
            v9.setDisplayQuotes("Happy Valentine's, my forever love.");
            v9.setBackgroundImage(R.drawable.gdr7); // Change the background image to gdr7
            DisplayQuotes.add(v9);
            BackgroundImage.add(v9);

            DisplayQuotesModal v10 = new DisplayQuotesModal();
            v10.setDisplayQuotes("Excited for more moments. Happy Valentine's Day!");
            v10.setBackgroundImage(R.drawable.grd2); // Change the background image to gdr2
            DisplayQuotes.add(v10);
            BackgroundImage.add(v10);
        }

        else if (catogeryName.equals("Husband")) {
            DisplayQuotesModal h1 = new DisplayQuotesModal();
            h1.setDisplayQuotes("To my amazing husband, Happy day of love!");
            h1.setBackgroundImage(R.drawable.gdr1);
            DisplayQuotes.add(h1);
            BackgroundImage.add(h1);

            DisplayQuotesModal h2 = new DisplayQuotesModal();
            h2.setDisplayQuotes("Happy Valentine's Day, my love and best friend!");
            h2.setBackgroundImage(R.drawable.gdr9);
            DisplayQuotes.add(h2);
            BackgroundImage.add(h2);

            DisplayQuotesModal h3 = new DisplayQuotesModal();
            h3.setDisplayQuotes("In your arms, I've found my forever home.");
            h3.setBackgroundImage(R.drawable.gdr10);
            DisplayQuotes.add(h3);
            BackgroundImage.add(h3);

            DisplayQuotesModal h4 = new DisplayQuotesModal();
            h4.setDisplayQuotes("To my husband, my heart, my love, my life.");
            h4.setBackgroundImage(R.drawable.grd4);
            DisplayQuotes.add(h4);
            BackgroundImage.add(h4);

            DisplayQuotesModal h5 = new DisplayQuotesModal();
            h5.setDisplayQuotes("Happy Valentine's, my forever love!");
            h5.setBackgroundImage(R.drawable.gdr5);
            DisplayQuotes.add(h5);
            BackgroundImage.add(h5);

            DisplayQuotesModal h6 = new DisplayQuotesModal();
            h6.setDisplayQuotes("You're the key to my heart. Happy Valentine's!");
            h6.setBackgroundImage(R.drawable.grd3); // Change the background image to gdr3
            DisplayQuotes.add(h6);
            BackgroundImage.add(h6);

            DisplayQuotesModal h7 = new DisplayQuotesModal();
            h7.setDisplayQuotes("To my husband, my love, my forever Valentine.");
            h7.setBackgroundImage(R.drawable.gdr6); // Change the background image to gdr6
            DisplayQuotes.add(h7);
            BackgroundImage.add(h7);

            DisplayQuotesModal h8 = new DisplayQuotesModal();
            h8.setDisplayQuotes("Happy Valentine's Day, my love and life partner!");
            h8.setBackgroundImage(R.drawable.gdr8); // Change the background image to grd8
            DisplayQuotes.add(h8);
            BackgroundImage.add(h8);

            DisplayQuotesModal h9 = new DisplayQuotesModal();
            h9.setDisplayQuotes("Happy Valentine's, my forever love.");
            h9.setBackgroundImage(R.drawable.gdr7); // Change the background image to gdr7
            DisplayQuotes.add(h9);
            BackgroundImage.add(h9);

            DisplayQuotesModal h10 = new DisplayQuotesModal();
            h10.setDisplayQuotes("Excited for more moments. Happy Valentine's Day!");
            h10.setBackgroundImage(R.drawable.grd2); // Change the background image to gdr2
            DisplayQuotes.add(h10);
            BackgroundImage.add(h10);
        }


        else if (catogeryName.equals("Work")) {
            DisplayQuotesModal w1 = new DisplayQuotesModal();
            w1.setDisplayQuotes("Success is a journey, not a destination. Keep working!");
            w1.setBackgroundImage(R.drawable.gdr1);
            DisplayQuotes.add(w1);
            BackgroundImage.add(w1);

            DisplayQuotesModal w2 = new DisplayQuotesModal();
            w2.setDisplayQuotes("Stay focused, stay determined. Your hard work will pay off.");
            w2.setBackgroundImage(R.drawable.gdr9);
            DisplayQuotes.add(w2);
            BackgroundImage.add(w2);

            DisplayQuotesModal w3 = new DisplayQuotesModal();
            w3.setDisplayQuotes("Every small step in your work journey counts. Keep going!");
            w3.setBackgroundImage(R.drawable.gdr10);
            DisplayQuotes.add(w3);
            BackgroundImage.add(w3);

            DisplayQuotesModal w4 = new DisplayQuotesModal();
            w4.setDisplayQuotes("Work hard in silence, let success be your noise.");
            w4.setBackgroundImage(R.drawable.grd4);
            DisplayQuotes.add(w4);
            BackgroundImage.add(w4);

            DisplayQuotesModal w5 = new DisplayQuotesModal();
            w5.setDisplayQuotes("Your work is a reflection of your dedication. Keep shining!");
            w5.setBackgroundImage(R.drawable.gdr5);
            DisplayQuotes.add(w5);
            BackgroundImage.add(w5);

            DisplayQuotesModal w6 = new DisplayQuotesModal();
            w6.setDisplayQuotes("Dream big, work hard, stay focused.");
            w6.setBackgroundImage(R.drawable.grd3); // Change the background image to gdr3
            DisplayQuotes.add(w6);
            BackgroundImage.add(w6);

            DisplayQuotesModal w7 = new DisplayQuotesModal();
            w7.setDisplayQuotes("Hard work beats talent when talent doesn't work hard.");
            w7.setBackgroundImage(R.drawable.gdr6); // Change the background image to gdr6
            DisplayQuotes.add(w7);
            BackgroundImage.add(w7);

            DisplayQuotesModal w8 = new DisplayQuotesModal();
            w8.setDisplayQuotes("Success is not for the lazy. Keep pushing yourself.");
            w8.setBackgroundImage(R.drawable.gdr8); // Change the background image to grd8
            DisplayQuotes.add(w8);
            BackgroundImage.add(w8);

            DisplayQuotesModal w9 = new DisplayQuotesModal();
            w9.setDisplayQuotes("In the world of work, your dedication sets you apart.");
            w9.setBackgroundImage(R.drawable.gdr7); // Change the background image to gdr7
            DisplayQuotes.add(w9);
            BackgroundImage.add(w9);

            DisplayQuotesModal w10 = new DisplayQuotesModal();
            w10.setDisplayQuotes("Success is the sum of small efforts repeated day in and day out.");
            w10.setBackgroundImage(R.drawable.grd2); // Change the background image to gdr2
            DisplayQuotes.add(w10);
            BackgroundImage.add(w10);
        }

        else if (catogeryName.equals("Inspirational")) {
            DisplayQuotesModal i1 = new DisplayQuotesModal();
            i1.setDisplayQuotes("Believe you can, and you're halfway there.");
            i1.setBackgroundImage(R.drawable.gdr1);
            DisplayQuotes.add(i1);
            BackgroundImage.add(i1);

            DisplayQuotesModal i2 = new DisplayQuotesModal();
            i2.setDisplayQuotes("Your only limit is your mind. Break free!");
            i2.setBackgroundImage(R.drawable.gdr9);
            DisplayQuotes.add(i2);
            BackgroundImage.add(i2);

            DisplayQuotesModal i3 = new DisplayQuotesModal();
            i3.setDisplayQuotes("In the middle of difficulty lies opportunity.");
            i3.setBackgroundImage(R.drawable.gdr10);
            DisplayQuotes.add(i3);
            BackgroundImage.add(i3);

            DisplayQuotesModal i4 = new DisplayQuotesModal();
            i4.setDisplayQuotes("Every day is a new beginning. Seize it!");
            i4.setBackgroundImage(R.drawable.grd4);
            DisplayQuotes.add(i4);
            BackgroundImage.add(i4);

            DisplayQuotesModal i5 = new DisplayQuotesModal();
            i5.setDisplayQuotes("Don't watch the clock; do what it does. Keep going!");
            i5.setBackgroundImage(R.drawable.gdr5);
            DisplayQuotes.add(i5);
            BackgroundImage.add(i5);

            DisplayQuotesModal i6 = new DisplayQuotesModal();
            i6.setDisplayQuotes("The only way to do great work is to love what you do.");
            i6.setBackgroundImage(R.drawable.grd3); // Change the background image to gdr3
            DisplayQuotes.add(i6);
            BackgroundImage.add(i6);

            DisplayQuotesModal i7 = new DisplayQuotesModal();
            i7.setDisplayQuotes("Success is not final, failure is not fatal: It is the courage to continue that counts.");
            i7.setBackgroundImage(R.drawable.gdr6); // Change the background image to gdr6
            DisplayQuotes.add(i7);
            BackgroundImage.add(i7);

            DisplayQuotesModal i8 = new DisplayQuotesModal();
            i8.setDisplayQuotes("Believe in yourself and all that you are. Know that there is something inside you that is greater than any obstacle.");
            i8.setBackgroundImage(R.drawable.gdr8); // Change the background image to grd8
            DisplayQuotes.add(i8);
            BackgroundImage.add(i8);

            DisplayQuotesModal i9 = new DisplayQuotesModal();
            i9.setDisplayQuotes("The future belongs to those who believe in the beauty of their dreams.");
            i9.setBackgroundImage(R.drawable.gdr7); // Change the background image to gdr7
            DisplayQuotes.add(i9);
            BackgroundImage.add(i9);

            DisplayQuotesModal i10 = new DisplayQuotesModal();
            i10.setDisplayQuotes("Your attitude, not your aptitude, will determine your altitude.");
            i10.setBackgroundImage(R.drawable.grd2); // Change the background image to gdr2
            DisplayQuotes.add(i10);
            BackgroundImage.add(i10);
        }

        else if (catogeryName.equals("Success")) {
            DisplayQuotesModal s1 = new DisplayQuotesModal();
            s1.setDisplayQuotes("Success is not final, failure is not fatal. It's the courage to continue that counts.");
            s1.setBackgroundImage(R.drawable.gdr1);
            DisplayQuotes.add(s1);
            BackgroundImage.add(s1);

            DisplayQuotesModal s2 = new DisplayQuotesModal();
            s2.setDisplayQuotes("Your success is a journey, not a destination. Enjoy the process!");
            s2.setBackgroundImage(R.drawable.gdr9);
            DisplayQuotes.add(s2);
            BackgroundImage.add(s2);

            DisplayQuotesModal s3 = new DisplayQuotesModal();
            s3.setDisplayQuotes("Success comes to those who work for it. Keep going!");
            s3.setBackgroundImage(R.drawable.gdr10);
            DisplayQuotes.add(s3);
            BackgroundImage.add(s3);

            DisplayQuotesModal s4 = new DisplayQuotesModal();
            s4.setDisplayQuotes("Don't just dream of success, work for it!");
            s4.setBackgroundImage(R.drawable.grd4);
            DisplayQuotes.add(s4);
            BackgroundImage.add(s4);

            DisplayQuotesModal s5 = new DisplayQuotesModal();
            s5.setDisplayQuotes("Success is the sum of small efforts repeated day in and day out.");
            s5.setBackgroundImage(R.drawable.gdr5);
            DisplayQuotes.add(s5);
            BackgroundImage.add(s5);

            DisplayQuotesModal s6 = new DisplayQuotesModal();
            s6.setDisplayQuotes("Success is not about the destination, but the journey you enjoy.");
            s6.setBackgroundImage(R.drawable.grd3); // Change the background image to gdr3
            DisplayQuotes.add(s6);
            BackgroundImage.add(s6);

            DisplayQuotesModal s7 = new DisplayQuotesModal();
            s7.setDisplayQuotes("The only place success comes before work is in the dictionary.");
            s7.setBackgroundImage(R.drawable.gdr6); // Change the background image to gdr6
            DisplayQuotes.add(s7);
            BackgroundImage.add(s7);

            DisplayQuotesModal s8 = new DisplayQuotesModal();
            s8.setDisplayQuotes("Success is not just about the destination; it's about the journey and lessons learned along the way.");
            s8.setBackgroundImage(R.drawable.gdr8); // Change the background image to grd8
            DisplayQuotes.add(s8);
            BackgroundImage.add(s8);

            DisplayQuotesModal s9 = new DisplayQuotesModal();
            s9.setDisplayQuotes("Success is the result of preparation, hard work, and learning from failure.");
            s9.setBackgroundImage(R.drawable.gdr7); // Change the background image to gdr7
            DisplayQuotes.add(s9);
            BackgroundImage.add(s9);

            DisplayQuotesModal s10 = new DisplayQuotesModal();
            s10.setDisplayQuotes("Success is not just a goal; it's a journey. Keep moving forward!");
            s10.setBackgroundImage(R.drawable.grd2); // Change the background image to gdr2
            DisplayQuotes.add(s10);
            BackgroundImage.add(s10);
        }



else if (catogeryName.equals("Birthday")) {
            DisplayQuotesModal b1 = new DisplayQuotesModal();
            b1.setDisplayQuotes("Happy Birthday! May your day be filled with joy and laughter.");
            b1.setBackgroundImage(R.drawable.gdr1);
            DisplayQuotes.add(b1);
            BackgroundImage.add(b1);

            DisplayQuotesModal b2 = new DisplayQuotesModal();
            b2.setDisplayQuotes("Wishing you a year ahead full of exciting adventures. Happy Birthday!");
            b2.setBackgroundImage(R.drawable.gdr9);
            DisplayQuotes.add(b2);
            BackgroundImage.add(b2);

            DisplayQuotesModal b3 = new DisplayQuotesModal();
            b3.setDisplayQuotes("Another year, another reason to celebrate. Happy Birthday!");
            b3.setBackgroundImage(R.drawable.gdr10);
            DisplayQuotes.add(b3);
            BackgroundImage.add(b3);

            DisplayQuotesModal b4 = new DisplayQuotesModal();
            b4.setDisplayQuotes("Happy Birthday! May this year be the best one yet.");
            b4.setBackgroundImage(R.drawable.grd4);
            DisplayQuotes.add(b4);
            BackgroundImage.add(b4);

            DisplayQuotesModal b5 = new DisplayQuotesModal();
            b5.setDisplayQuotes("Wishing you happiness, health, and all the best on your birthday.");
            b5.setBackgroundImage(R.drawable.gdr5);
            DisplayQuotes.add(b5);
            BackgroundImage.add(b5);

            DisplayQuotesModal b6 = new DisplayQuotesModal();
            b6.setDisplayQuotes("Another trip around the sun. Happy Birthday!");
            b6.setBackgroundImage(R.drawable.grd3); // Change the background image to gdr3
            DisplayQuotes.add(b6);
            BackgroundImage.add(b6);

            DisplayQuotesModal b7 = new DisplayQuotesModal();
            b7.setDisplayQuotes("May your day be as bright as your smile. Happy Birthday!");
            b7.setBackgroundImage(R.drawable.gdr6); // Change the background image to gdr6
            DisplayQuotes.add(b7);
            BackgroundImage.add(b7);

            DisplayQuotesModal b8 = new DisplayQuotesModal();
            b8.setDisplayQuotes("Happy Birthday! Another year wiser and more wonderful.");
            b8.setBackgroundImage(R.drawable.gdr8); // Change the background image to grd8
            DisplayQuotes.add(b8);
            BackgroundImage.add(b8);

            DisplayQuotesModal b9 = new DisplayQuotesModal();
            b9.setDisplayQuotes("Wishing you love, laughter, and all the things that make you happy. Happy Birthday!");
            b9.setBackgroundImage(R.drawable.gdr7); // Change the background image to gdr7
            DisplayQuotes.add(b9);
            BackgroundImage.add(b9);

            DisplayQuotesModal b10 = new DisplayQuotesModal();
            b10.setDisplayQuotes("Happy Birthday! May your day be filled with surprises and joy.");
            b10.setBackgroundImage(R.drawable.grd2); // Change the background image to gdr2
            DisplayQuotes.add(b10);
            BackgroundImage.add(b10);
        }

        if (catogeryName.equals("Friendship")) {
            DisplayQuotesModal f1 = new DisplayQuotesModal();
            f1.setDisplayQuotes("Cheers to the friends who make life brighter. Happy Friendship!");
            f1.setBackgroundImage(R.drawable.gdr1);
            DisplayQuotes.add(f1);
            BackgroundImage.add(f1);

            DisplayQuotesModal f2 = new DisplayQuotesModal();
            f2.setDisplayQuotes("Wishing you laughter, joy, and unforgettable moments. Happy Friendship!");
            f2.setBackgroundImage(R.drawable.gdr9);
            DisplayQuotes.add(f2);
            BackgroundImage.add(f2);

            DisplayQuotesModal f3 = new DisplayQuotesModal();
            f3.setDisplayQuotes("In the journey of life, grateful for the friends who walk beside us.");
            f3.setBackgroundImage(R.drawable.gdr10);
            DisplayQuotes.add(f3);
            BackgroundImage.add(f3);

            DisplayQuotesModal f4 =  new DisplayQuotesModal();
            f4.setDisplayQuotes("Happy Friendship! To the friends who fill our lives with love and laughter.");
            f4.setBackgroundImage(R.drawable.grd4);
            DisplayQuotes.add(f4);
            BackgroundImage.add(f4);

            DisplayQuotesModal f5 = new DisplayQuotesModal();
            f5.setDisplayQuotes("Cheers to the moments, big and small, shared with friends.");
            f5.setBackgroundImage(R.drawable.gdr5);
            DisplayQuotes.add(f5);
            BackgroundImage.add(f5);

            DisplayQuotesModal f6 = new DisplayQuotesModal();
            f6.setDisplayQuotes("Happy Friendship! Grateful for the friends who make our lives extraordinary.");
            f6.setBackgroundImage(R.drawable.grd3); // Change the background image to gdr3
            DisplayQuotes.add(f6);
            BackgroundImage.add(f6);

            DisplayQuotesModal f7 = new DisplayQuotesModal();
            f7.setDisplayQuotes("In the book of life, the chapter on friendship is our favorite.");
            f7.setBackgroundImage(R.drawable.gdr6); // Change the background image to gdr6
            DisplayQuotes.add(f7);
            BackgroundImage.add(f7);

            DisplayQuotesModal f8 = new DisplayQuotesModal();
            f8.setDisplayQuotes("Happy Friendship! To the friends who make our days brighter and hearts lighter.");
            f8.setBackgroundImage(R.drawable.gdr8); // Change the background image to grd8
            DisplayQuotes.add(f8);
            BackgroundImage.add(f8);

            DisplayQuotesModal f9 = new DisplayQuotesModal();
            f9.setDisplayQuotes("Cheers to the friends who turn ordinary moments into extraordinary memories.");
            f9.setBackgroundImage(R.drawable.gdr7); // Change the background image to gdr7
            DisplayQuotes.add(f9);
            BackgroundImage.add(f9);

            DisplayQuotesModal f10 = new DisplayQuotesModal();
            f10.setDisplayQuotes("Happy Friendship! To the friends who make every day a celebration.");
            f10.setBackgroundImage(R.drawable.grd2); // Change the background image to gdr2
            DisplayQuotes.add(f10);
            BackgroundImage.add(f10);
        }

        if (catogeryName.equals("Time")) {
            DisplayQuotesModal t1 = new DisplayQuotesModal();
            t1.setDisplayQuotes("Time is precious, make every moment count.");
            t1.setBackgroundImage(R.drawable.gdr1);
            DisplayQuotes.add(t1);
            BackgroundImage.add(t1);

            DisplayQuotesModal t2 = new DisplayQuotesModal();
            t2.setDisplayQuotes("Embrace the present, cherish the past, and look forward to the future.");
            t2.setBackgroundImage(R.drawable.gdr9);
            DisplayQuotes.add(t2);
            BackgroundImage.add(t2);

            DisplayQuotesModal t3 = new DisplayQuotesModal();
            t3.setDisplayQuotes("Time flies, but memories last forever.");
            t3.setBackgroundImage(R.drawable.gdr10);
            DisplayQuotes.add(t3);
            BackgroundImage.add(t3);

            DisplayQuotesModal t4 = new DisplayQuotesModal();
            t4.setDisplayQuotes("Use your time wisely; it's a limited resource.");
            t4.setBackgroundImage(R.drawable.grd4);
            DisplayQuotes.add(t4);
            BackgroundImage.add(t4);

            DisplayQuotesModal t5 = new DisplayQuotesModal();
            t5.setDisplayQuotes("Every second counts; make them all meaningful.");
            t5.setBackgroundImage(R.drawable.gdr5);
            DisplayQuotes.add(t5);
            BackgroundImage.add(t5);

            DisplayQuotesModal t6 = new DisplayQuotesModal();
            t6.setDisplayQuotes("Time is the currency of life; spend it wisely.");
            t6.setBackgroundImage(R.drawable.grd3); // Change the background image to gdr3
            DisplayQuotes.add(t6);
            BackgroundImage.add(t6);

            DisplayQuotesModal t7 = new DisplayQuotesModal();
            t7.setDisplayQuotes("In the tapestry of life, time is the most intricate thread.");
            t7.setBackgroundImage(R.drawable.gdr6); // Change the background image to gdr6
            DisplayQuotes.add(t7);
            BackgroundImage.add(t7);

            DisplayQuotesModal t8 = new DisplayQuotesModal();
            t8.setDisplayQuotes("Time teaches us the value of every moment.");
            t8.setBackgroundImage(R.drawable.gdr8); // Change the background image to grd8
            DisplayQuotes.add(t8);
            BackgroundImage.add(t8);

            DisplayQuotesModal t9 = new DisplayQuotesModal();
            t9.setDisplayQuotes("Make time for the things that truly matter.");
            t9.setBackgroundImage(R.drawable.gdr7); // Change the background image to gdr7
            DisplayQuotes.add(t9);
            BackgroundImage.add(t9);

            DisplayQuotesModal t10 = new DisplayQuotesModal();
            t10.setDisplayQuotes("The best time to start is now. Seize the moment!");
            t10.setBackgroundImage(R.drawable.grd2); // Change the background image to gdr2
            DisplayQuotes.add(t10);
            BackgroundImage.add(t10);
        }





        LinearLayoutManager manager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        binding.DiaplayQuotesRecycler.setLayoutManager(manager);

        DisplayQuotesAdapter adapter = new DisplayQuotesAdapter(this,DisplayQuotes,BackgroundImage);
        binding.DiaplayQuotesRecycler.setAdapter(adapter);

    }

}
