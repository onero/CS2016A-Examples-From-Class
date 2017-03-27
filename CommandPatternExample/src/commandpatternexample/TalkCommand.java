/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpatternexample;

/**
 *
 * @author jeppjleemoritzled
 */
public class TalkCommand implements RobotCommand
{
    private final Robot r;
    private final String talkString;
    private final RobotVoiceType voiceType;

    public TalkCommand(Robot r, String talkString, RobotVoiceType voiceType)
    {
        this.r = r;
        this.talkString = talkString;
        this.voiceType = voiceType;
    }

    @Override
    public void execute()
    {
        r.talk(talkString, voiceType);
    }
    
    
}
