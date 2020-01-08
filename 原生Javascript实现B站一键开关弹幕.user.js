// ==UserScript==
// @name         原生Javascript实现B站一键开关弹幕
// @namespace    http://tampermonkey.net/
// @version      0.1
// @description  try to take over the world!
// @author       You
// @include      *://www.bilibili.com/video/av*
// @include      *://www.bilibili.com/bangumi/play/ep*
// @include      *://www.bilibili.com/bangumi/play/ss*
// @include      *://m.bilibili.com/bangumi/play/ep*
// @include      *://m.bilibili.com/bangumi/play/ss*
// @include      *://bangumi.bilibili.com/anime/*
// @include      *://bangumi.bilibili.com/movie/*
// @include      *://www.bilibili.com/bangumi/media/md*
// @include      *://www.bilibili.com/blackboard/html5player.html*
// @include      *://link.acg.tv/forum.php*
// @run-at       document-end
// @grant        none
// ==/UserScript==


(function() {
    'use strict';

    // Your code here...
    var danMuOn = document.getElementsByClassName('bui-checkbox');
    var danMu = document.getElementsByClassName('bilibili-player-video-danmaku');
    var count = 0;
    document.onkeypress = function(e){
     if(e.keyCode == 13){
         count++;
         if(count%2 != 0){
          danMuOn[0].checked = false;
          danMu[0].style.zIndex = -99;
         }
         if(count%2 == 0){
          danMuOn[0].checked = true;
          danMu[0
               ].style.zIndex = 11;
         }
      }
    };
    //e.keyCode == 13 默认是回车键，可以自己更改；
})();