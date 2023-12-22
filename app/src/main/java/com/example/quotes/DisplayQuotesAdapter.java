package com.example.quotes;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DisplayQuotesAdapter  extends RecyclerView.Adapter<DisplayQuotesAdapter.MyviewHolder> {

    QuotesActivity quotesActivity;
    private int currentImageIndex = 0;
    ArrayList<DisplayQuotesModal> displayQuotes;
    ArrayList<DisplayQuotesModal> backgroundImage;

    public DisplayQuotesAdapter(QuotesActivity quotesActivity, ArrayList<DisplayQuotesModal> displayQuotes, ArrayList<DisplayQuotesModal> backgroundImage) {
        this.quotesActivity = quotesActivity;

        this.backgroundImage = backgroundImage;
        this.displayQuotes = displayQuotes;
    }

    @NonNull
    @Override
    public DisplayQuotesAdapter.MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(quotesActivity).inflate(R.layout.item_file_quoets_diaplay, parent, false);
        MyviewHolder my = new MyviewHolder(view);
        return my;
    }

    @Override
    public void onBindViewHolder(@NonNull DisplayQuotesAdapter.MyviewHolder holder, int position) {
        int i = position;
        holder.txtDisplayQuotes.setText(displayQuotes.get(i).getDisplayQuotes());
        holder.imgQuotesBackgroungImage.setImageResource(backgroundImage.get(i).getBackgroundImage());
        holder.imgQuotesBackgroungImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Increment index to show the next image
                currentImageIndex = (currentImageIndex + 1) % backgroundImage.size();
                holder.imgQuotesBackgroungImage.setImageResource(backgroundImage.get(currentImageIndex).getBackgroundImage());
            }
        });
        holder.btnCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                copyToClipboard(quotesActivity, displayQuotes.get(i).getDisplayQuotes());
            }
        });

        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareQuote(quotesActivity, displayQuotes.get(i).getDisplayQuotes());
            }
        });
    }

    @Override
    public int getItemCount() {
        return displayQuotes.size();
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {
        TextView txtDisplayQuotes;
        Button btnCopy,btnShare;

        ImageView imgQuotesBackgroungImage;

        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            btnCopy = itemView.findViewById(R.id.btnCopy);
            txtDisplayQuotes = itemView.findViewById(R.id.txtDisplayQuotes);
            imgQuotesBackgroungImage = itemView.findViewById(R.id.imgQuotesBackgroungImage);
            btnShare = itemView.findViewById(R.id.btnShare);
        }
    }

    private void copyToClipboard(Context context, String text) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clipData = ClipData.newPlainText("Quote", text);
        clipboardManager.setPrimaryClip(clipData);
        Toast.makeText(context, "Quote copied to clipboard !", Toast.LENGTH_SHORT).show();
    }

    private void shareQuote(Context context, String text) {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, text);
        context.startActivity(Intent.createChooser(shareIntent, "Share using"));
    }
}



