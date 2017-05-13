/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RohAn
 */

import com.sun.speech.freetts.*;

public class Speech {

    private static final String Voice_name = "kevin16";

    public static void main(String[] args) {
        Voice voice;
        VoiceManager vm=VoiceManager.getInstance();
        voice=vm.getVoice(Voice_name);
        voice.allocate();
        try
        {
            voice.speak("Hello Sir what can i do for you");
        }
        catch(Exception e)
        {
            
        }
    }

}
