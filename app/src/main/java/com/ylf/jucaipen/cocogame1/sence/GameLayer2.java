package com.ylf.jucaipen.cocogame1.sence;

import org.cocos2d.actions.interval.CCJumpTo;
import org.cocos2d.layers.CCLayer;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.types.CGPoint;

/**
 * Created by Administrator on 2015/12/17.
 */
public class GameLayer2 extends CCLayer {
   CCSprite player2;
    public  GameLayer2(){
        player2=CCSprite.sprite("player.png");
        addChild(player2);
        CGPoint point=CGPoint.ccp(200,200);
        player2.setPosition(point);
        CGPoint jumpPosition=CGPoint.ccp(300,200);
        CCJumpTo jumpTo=CCJumpTo.action(3,jumpPosition,200,2);
        player2.runAction(jumpTo);

    }


}
