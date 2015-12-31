package zapper.macronesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class hdgamepage3 extends AppCompatActivity {

    int counter = 0;
    int subCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hdgamepage3);
    }

    public void nextText (View v){
        Intent mIntent = getIntent();
        int mClickCounter = mIntent.getIntExtra("COUNTER", 0);

        String lines = " xxxCapt. Adams: Salutations stranger! I am a guest in your country.xxxThe dark stranger makes a face like he had just heard an insult.xxxIt appears that the sound of proper English is not pleasant to the ears of foreigners.xxxHe is still pointing that sharpened stick at me, meaning a fight is still on the table.xxxWhile none of my crew has ever been to the New World, we have heard stories of the natives that inhabit it.xxxThe most important lesson: they will kill you if you confuse them, so strike first.xxxI have not given up on a peaceful resolution to this confrontation, but I assume a more defensible stance anyway.xxxDark stranger: Brah! You like scrap?!?xxxThings are not going well...xxxI need to calm him down somehow.xxxCapt. Adams: Listen friend, I mean no-xxxDark stranger: RRRGGHHHHHAAA!!!xxxDiplomacy is definitely off the table now.xxxThe stranger suddenly lunges at me and thrusts his weapon into my side.xxxI try to slash this savage's throat, but am paralyzed by waves of pain as he twists his wooden dagger within me.xxxI can feel the splinters in my lungs as though I had inhaled nails.xxxThis strange land around me grows dark, and all I see is this stranger's face gazing into mine.xxxAs I look into his eyes, they remind me of an animal's...xxxNo reason could have ever convinced this creature to go against its violent instincts.xxxGod, why didn't I strike first?!?xxx xxxCapt. Adams: Eh brah, I like dolla! I'm not looking for a fight.xxxI lower Kai's knife and assume a casual stance, despite being wide open for attack.xxxLikewise, the stranger lowers his own weapon.xxxDark stranger: Brah! You talk like me! Weah you from?xxxI have only an inkling as to what he is saying, so I take a moment to figure out how to reply.xxxDark stranger: Ho! What kine shirt is dat? Looks like Dolla!xxxHe locks his stare onto my deep green vest with a seemingly joyful curiosity.xxxCapt. Adams: Dolla?xxxDark stranger: Ya brah!xxxThe stranger's mood seems to have improved after taking a closer look at my clothes.xxxAnd it would seem the words \"brah\" and \"dolla\" illicit positive reactions from this person.xxxPerhaps if I mimic his manner of speech, I can get his cooperation.xxxCapt. Adams: Brah, who are you?xxxDark stranger: Brah, I'm Mahreo.xxxMahreo... I always knew names from outside England were strange.xxxCapt. Adams: Call me Adams.xxxMahreo: Ado?xxxI point to myself and make sure every syllable comes out clearly.xxxCapt. Adams: Adams.xxxMahreo: Adolla!xxxCapt. Adams: No, it's-xxxMahreo: So Adolla brah, why you stay in Mayo Raits?xxxThere he goes again, moving onto another subject even though his understanding of the one before is wrong.xxxCapt. Adams: What is Mayo Raits?xxxMahreo: Weah you stay now!xxxSo, this new land already has a name...xxxCapt. Adams: I was shipwrecked.xxxMahreo gives me another clueless look.xxxI point at the wooden debris all along the coastline.xxxCapt. Adams: Brah, my boat!xxxMahreo: Ohhhhh, your boat all buss'up huh?xxxBefore I could ask him what \"buss'up\" meant, Mahreo starts walking up a narrow path leading away from the coast.xxxMahreo: Come, Adolla. We get moah dolla later.xxxI do not know if this is his native way of agreeing to help me out of my predicament or enslaving me.xxxHowever, getting off of this island alone is an impossible task.xxxAnd getting the dark-skinned inhabitants of this island to help me build a seacraft worthy enough to contact England or at least one of its many ships isn't? Hah.xxxIf Mahreo is bringing me to more of his kind and they choose to help me, I may have found salvation.xxxIf they prove to be even more hostile than Mahreo, I will simply escape during the night.xxxAs I tuck Kai's knife in my belt and begin to follow Mahreo up the rocky clearing, I wonder how a community of his kind functions.xxxI wish to give a name for these people for when I write about them to England.xxxThey say they live on this island, Mayo Raits.xxxShall I call them Mayons?xxxNo... I believe that sounds too similar to another society...xxxThe island I am on is rather large, and the people on them are full of personality just as large.xxxLarge. Island. Macronesia...xxxPerfect.xxxThe name rolls off the tongue and sparks intrigue in explorers.xxxI continue following Mahreo toward what I assume is his home, feeling a mixture of danger and excitement.xxxIt is a familiar emotion.xxxThat same thrill I felt during my first naval battle and round of poker is now resurfacing as I walk on the uneven soil of Macronesia.xxxAnd thus begins my life with these Macronesians.xxx xxxCapt. Adams: Stand and deliver, savage!xxxI tighten my grip on the knife and widen my fighting stance.xxxThe dark stranger narrows his eyes, any curiosity he has about me now replaced with anger.xxxThere is a tension in the air as we stare each other down unflinchingly.xxxThis stranger's stick is obviously a stabbing weapon, so I plan to parry his stab and deliver a strike to his neck.xxxI watch for any sign of movement in my enemy.xxxFor an uncouth savage, he is remarkably patient in combat.xxxI suddenly feel a sharp twinge inside my head.xxxThe battering I took from the shipwreck has not been tended to yet, but I try to focus on the pressing matter at-xxxDark stranger: RRRGGHHHHHAAA!!!xxxThe brute must have noticed the small opening I made for myself when I was regaining my focus.xxxHe moved like black lightning, thrusting himself into my body.xxxThe sharp pain in my head is now replaced with a sharp pain in my chest.xxxThe stranger puts his black face up to mine and snarls.xxxI keep my stare on him as I try to bring Kai's knife to his throat, but it is in vain.xxxHe twists the wooden stake, and I can feel my heart writhe within my body.xxxMy limbs grow cold as my blood drains out into the thirsty sand.xxxThe features on the dark stranger's face start to fade and grow even darker.xxxThis is the end...xxxI think back to my days in the Royal Navy, and at the card table.xxxHow many times I have put myself on the line and lost.xxxMy only regret, aside from this particular duel, is having to die looking at a face so hideous.xxx ";
        String[] arrayLines = lines.split("xxx");

        counter = mClickCounter + subCounter;
        String nextLine = arrayLines[counter];

        TextView t = (TextView) findViewById(R.id.textView);
        t.setText(nextLine);

        ImageView image = (ImageView) findViewById(R.id.imageView);

        if (counter == 2){
            image.setImageResource(R.drawable.hdbadend1);
        }

        if (counter == 12){
            image.setImageResource(R.drawable.hdbadend2);
        }

        if (counter == 14){
            image.setImageResource(R.drawable.hdbadend3);
        }

        if (counter == 16){
            image.setImageResource(R.drawable.hdbadend4);
        }

        if (counter == 17){
            image.setImageResource(R.drawable.hdbadend5);
        }

        if (counter == 19){
            image.setImageResource(R.drawable.hdbadend6);
        }

        if (counter == 20){
            image.setImageResource(R.drawable.hdbadend7);
        }

        if (counter == 21){
            Intent Badend1 = new Intent(this,hdbadend.class);
            startActivity(Badend1);
            finish();
        }

        if (counter == 24){
            image.setImageResource(R.drawable.hdmahreo2);
        }

        if (counter == 30){
            image.setImageResource(R.drawable.hdmahreo3);
        }

        if (counter == 38){
            image.setImageResource(R.drawable.hdmahreo2);
        }

        if (counter == 41){
            image.setImageResource(R.drawable.hdmahreo3);
        }

        if (counter == 49){
            image.setImageResource(R.drawable.hdmahreo2);
        }

        if (counter == 53){
            image.setImageResource(R.drawable.hdbeach2);
        }

        if (counter == 54){
            image.setImageResource(R.drawable.hdgoodend1);
        }

        if (counter == 73){
            Intent Goodend1 = new Intent(this,hdgoodend.class);
            startActivity(Goodend1);
            finish();
        }

        if (counter == 76){
            image.setImageResource(R.drawable.hdbadend1);
        }

        if (counter == 83){
            image.setImageResource(R.drawable.hdbadend2);
        }

        if (counter == 85){
            image.setImageResource(R.drawable.hdbadend3);
        }

        if (counter == 89){
            image.setImageResource(R.drawable.hdbadend4);
        }

        if (counter == 91){
            image.setImageResource(R.drawable.hdbadend5);
        }

        if (counter == 93){
            image.setImageResource(R.drawable.hdbadend6);
        }

        if (counter == 95){
            image.setImageResource(R.drawable.hdbadend7);
        }

        if (counter == 96){
            Intent Badend1 = new Intent(this,hdbadend.class);
            startActivity(Badend1);
            finish();
        }


        subCounter++;

    }
}
