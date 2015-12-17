package com.ylf.jucaipen.cocogame1.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import com.ylf.jucaipen.cocogame1.sence.GameLayer1;
import com.ylf.jucaipen.cocogame1.sence.GameLayer2;
import com.ylf.jucaipen.cocogame1.sence.GameLayer3;
import com.ylf.jucaipen.cocogame1.sence.GameLayer4;
import org.cocos2d.layers.CCScene;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.opengl.CCGLSurfaceView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CCGLSurfaceView view = new CCGLSurfaceView(this);
        setContentView(view);

        CCDirector director = CCDirector.sharedDirector();
        director.attachInView(view);
        director.setDisplayFPS(true);
        director.setAnimationInterval(1 / 60.0);

        CCScene scene = CCScene.node();
        director.setDeviceOrientation(CCDirector.kCCDeviceOrientationPortrait);
        director.setScreenSize(400, 400);
        GameLayer1 layer1 = new GameLayer1();
        scene.addChild(layer1, 0, 0);
        GameLayer2 layer2=new GameLayer2();
        scene.addChild(layer2, 1, 1);
        GameLayer3 layer3=new GameLayer3();
        scene.addChild(layer3, 3, 3);
        GameLayer4 layer4=new GameLayer4();
        scene.addChild(layer4,4,4);
        director.runWithScene(scene);
    }



    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action=event.getAction();
        switch (action){
            case MotionEvent.ACTION_SCROLL:

                break;
            case  MotionEvent.ACTION_DOWN:
                float downX=event.getX();
                float downY=event.getY();
                Log.i("111","downX:"+downX+"  downY:"+downY);
                break;
            case  MotionEvent.ACTION_UP:
                float upX=event.getX();
                float upY=event.getY();
                Log.i("111","upX:"+upX+"  upY:"+upY);
                break;
            case  MotionEvent.ACTION_MOVE:
                break;
        }
        return super.onTouchEvent(event);
    }

}
