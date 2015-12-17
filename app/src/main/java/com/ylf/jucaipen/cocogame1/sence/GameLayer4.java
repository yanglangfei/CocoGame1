package com.ylf.jucaipen.cocogame1.sence;

import org.cocos2d.actions.instant.CCFlipY;
import org.cocos2d.layers.CCLayer;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.types.CGPoint;

/**
 * Created by Administrator on 2015/12/17.
 */
public class GameLayer4 extends CCLayer {
    private CCSprite player4;
    public GameLayer4() {
        player4=CCSprite.sprite("player.png");
        CGPoint position=CGPoint.ccp(500,100);
        player4.setPosition(position);
        addChild(player4);

        CCFlipY flipY=CCFlipY.action(true);
        player4.runAction(flipY);

    }

}
