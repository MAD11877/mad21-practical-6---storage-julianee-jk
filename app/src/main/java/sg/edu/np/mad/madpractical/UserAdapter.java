package sg.edu.np.mad.madpractical;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Random;

public class UserAdapter extends RecyclerView.Adapter<ViewHolder>{
    ArrayList<User> data;
    Context context;

    public UserAdapter(ArrayList<User> input, Context mContext) {
        data = input;
        context = mContext;
    }

    //continue from previous slide
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.userinfo, parent, false);
        return new ViewHolder(item);
    }

    //continue from previous slide
    public void onBindViewHolder(ViewHolder holder, int position) {
        User user = data.get(position);
        holder.name.setText(user.name);
        holder.description.setText(user.description);

        if (user.getName().endsWith("7")) {
            holder.imageBig.setVisibility(View.VISIBLE);
        }
        else {
            holder.imageBig.setVisibility(View.GONE);
        }

        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creating dialog box
                new AlertDialog.Builder(holder.image.getContext())
                        .setTitle("Profile")
                        .setMessage(user.name)
                        .setNegativeButton("Close", null)
                        .setPositiveButton("View", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // Continue with delete operation
                                Intent intent = new Intent(context, MainActivity.class);
                                intent.putExtra("Position", position);
                                context.startActivity(intent);
                            }
                        }).show();
            }
        });
    }
    //continue from previous slide
    public int getItemCount() {
        return data.size();
    }
}
//end of adapter class



