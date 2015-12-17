package com.ylf.jucaipen.cocogame1.sence;

import org.cocos2d.actions.interval.CCRotateTo;
import org.cocos2d.layers.CCLayer;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.types.CGPoint;

/**
 * Created by Administrator on 2015/12/17.
 */
public class GameLayer3 extends CCLayer{
    CCSprite player3;
    public  GameLayer3(){
        player3=CCSprite.sprite("player.png");
        CGPoint point=CGPoint.ccp(100,100);
        player3.setPosition(point);
        addChild(player3);
        CCRotateTo rotateTo=CCRotateTo.action(3,180);
        player3.runAction(rotateTo);

    }
}
