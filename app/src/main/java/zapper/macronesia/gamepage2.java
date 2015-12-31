package zapper.macronesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class gamepage2 extends AppCompatActivity {

    int counter = 0;
    int subCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamepage2);
    }
    public void nextText (View v){
        Intent mIntent = getIntent();
        int mClickCounter = mIntent.getIntExtra("COUNTER", 0);

        String lines = " xxxCapt. Adams: Finally some good news! Good work crew!xxxCapt. Adams: Just tell me when we get there.xxxCapt. Adams: You are a fool, Kai. We are far from famous right now!xxxKai flashes me a dumb smile and leaves, most likely to grab a celebratory snack from our nearly depleted rations.xxxMy lack of enthusiasm did not have any effect on Kai, as he leaves my quarters.xxxKai becomes obviously crestfallen. He leaves my quarters to look for something to eat.xxxNow that I am alone with my thoughts, I begin to realize my 3 months in this watery purgatory may finally be over.xxxI try to imagine what this new land may offer, but my mind is clouded from binging on rum.xxxI do not regret this, as the water we have onboard has become foul and I would rather die retching up rum than soiled water.xxxAs I look down at the cracks and bootprints that decorate the floorboards, my eyelids grow heavy...xxxzzz...xxxCCCRRRAACKKSHHxxxI am awoken by a thunderous sound as well as from the impact of my head into the wall of the ship.xxxI open the door to the deck.xxxIt is nearly pitch black outside but I can feel the rain.xxxAnd hear the screams.xxxDear God! The entire bow of the Epileptic Dolphin has been sheared off!xxxMost of the crew slept in the previous slave quarters below deck, now ripped asunder.xxxI hear a familiar voice yelling amidst the roaring sea.xxxLookout: Captain Adams! The reef! It's sawed our ship!xxxMy eyes are wide awake, but my brain is still drowning in cheap alcohol and unable to process the gravity of the situation.xxxI could only stand from the edge of the deck and watch as the black waves gilded with white foam toy with my ship.xxxThe Epileptic Dolphin is thrashing about in the water, finally living up to its namesake.xxxBefore I could turn around, a wave nearly as tall as the mast slams into the half-ship.xxxI am put back to sleep from the impact of my head into the wall of the ship.xxx...xxxI feel my body resting on something I have not felt in months.xxxThis strange surface is not the wood floor I have grown accustomed to passing out on...xxxIs it...sand?xxxI open my eyes to have my first view of the afterlife.xxxI do not see the pearly gates, just a coastline with the debris of the Epileptic Dolphin strewn about.xxxThe throbbing headache from my hangover and concussion reminds me that I am still alive.xxxGetting back on my feet, I start staggering along the shore.xxxWith any luck, supplies, and perhaps even my crew will have been safely washed ashore as well.xxxAside from an abundance of wooden debris and soaked, illegible parchments, not much of my ship has been deposited on this land.xxxThe only notable item I found was a compass, most likely owned by my late navigator.xxxAs I closely examine a peculiar pile of flotsam, I hear a moan.xxx\"Ueerghhh...\"xxxCapt. Adams: Who goes there?xxxKai: Captain...first sailor Ka- uerrghhh...xxxCapt. Adams: Kai!xxxHis trousers are dyed a deep crimson. Like my ship, Kai did not arrive on this shore in one piece.xxxKai: I'm sorry... captain.xxxCapt. Adams: Be still Kai, you are gravely injured.xxxKai disregards what I said and starts feeling around the wounds on his back.xxxHe pulls out what looks like a large paring knife, covered in his own blood.xxxKai: Heh...this was my punishment for raiding the galley... last night.xxxKai reaches out to hand me the knife as though my own life will depend upon it soon.xxxAs I take the blade from his bloody palm, I smile wryly at my dying first sailor.xxxCapt. Adams: At least you found the new land we were looking for.xxxKai exhales heavily and lets his outstretched arm fall to the ground.xxxHe flashes me one more buck-toothed grin.xxxAnd then he is gone.xxxPoor lad...xxxI should bury him, it is the least a captain could do for a loyal crewmate.xxxI turn around, looking for a good spot to-xxx\"Eh brah! I like dolla!?!\"xxxI am suddenly confronted with an imposing, tattooed figure.xxxHe has long, unkempt hair the color of tar bundled into two messy braids.xxxHis muscular dark body is covered in tattoos, almost like a pattern drawn in the mud.xxxIn his calloused hand is a sharpened wooden tool pointed straight at me.xxxDark stranger: Eh brah! Who you? What kine penso you got dere!?xxxThe dark stranger seems to have his eyes fixed on the knife in my hand.xxxI do not understand what he is saying, but his hunched posture and furrowed brows already tells me he's ready to fight.xxxI have been trained in close quarters combat during my time in the Royal Navy, and I am sure my steel blade can outmatch this savage's sharpened stick.xxxHowever, traversing the sea has taken its toll on my body, and there is not much to gain from killing this man.xxxMaybe there is something I can say to put him at ease, but what can an Englishman possibly say to please this stranger's foreign ears?xxxWhat to do...xxxHm";
        String[] arrayLines = lines.split("xxx");

        counter = mClickCounter + subCounter;
        String nextLine = arrayLines[counter];

        TextView t = (TextView) findViewById(R.id.textView);
        t.setText(nextLine);

        ImageView image = (ImageView) findViewById(R.id.imageView);

        if (counter == 6){
            image.setImageResource(R.drawable.doorkaisad);
        }

        if (counter == 5){
            image.setImageResource(R.drawable.doorkai);
            subCounter++;
        }

        if (counter == 4){
            image.setImageResource(R.drawable.doorkaihappy);
            subCounter = subCounter + 2;
        }

        if (counter == 3){
            subCounter = subCounter + 2;
        }

        if (counter == 2){
            subCounter = subCounter + 2;
        }

        if (counter == 1){
            subCounter = subCounter + 2;
        }

        if (counter == 7){
            image.setImageResource(R.drawable.door);
        }

        if (counter == 8){
            image.setImageResource(R.drawable.walteradams);
        }

        if (counter == 10){
            image.setImageResource(R.drawable.walteradamssleep);
        }

        if (counter == 11){
            image.setImageResource(R.color.black);
        }

        if (counter == 13){
            image.setImageResource(R.drawable.doordark);
        }

        if (counter == 15){
            image.setImageResource(R.drawable.storm1);
        }

        if (counter == 17){
            image.setImageResource(R.drawable.storm2);
        }

        if (counter == 24){
            image.setImageResource(R.drawable.storm3);
        }

        if (counter == 25){
            image.setImageResource(R.color.black);
        }

        if (counter == 30){
            image.setImageResource(R.drawable.beach1);
        }

        if (counter == 35){
            image.setImageResource(R.drawable.beach2);
        }

        if (counter == 36){
            image.setImageResource(R.drawable.beach2compass);
        }

        if (counter == 37){
            image.setImageResource(R.drawable.beach2);
        }

        if (counter == 40){
            image.setImageResource(R.drawable.beachkai1);
        }

        if (counter == 45){
            image.setImageResource(R.drawable.beachkai2);
        }

        if (counter == 49){
            image.setImageResource(R.drawable.beachkai3);
        }

        if (counter == 50){
            image.setImageResource(R.drawable.beachkai1);
        }

        if (counter == 52){
            image.setImageResource(R.drawable.beachkai4);
        }

        if (counter == 53){
            image.setImageResource(R.drawable.beachkai5);
        }

        if (counter == 57){
            image.setImageResource(R.drawable.mahreo1);
        }

        if (counter == 69){
            Intent Choice2 = new Intent(this,choice2.class);
            startActivity(Choice2);
            finish();
        }

        subCounter++;

    }

}
