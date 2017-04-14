/**
 * Created by USER on 10.04.17.
 */

"use strict";

var hello = "Hello world!";
var COLOR_ORANGE = "#FF7F00";
var color = COLOR_ORANGE;
/*alert('This is JavaScript!');
alert('More information');
alert(hello);
alert(color);*/

/*var access = parseInt("10010", 2);
alert(access);
var access1 = access.toString(2);
alert(access1);*/

var ACCESS_ADMIN = 1; // 00001
var ACCESS_GOODS_EDIT = 2; // 00010
var ACCESS_GOODS_VIEW = 4; // 00100
var ACCESS_ARTICLE_EDIT = 8; // 01000
var ACCESS_ARTICLE_VIEW = 16; // 10000

var guest = ACCESS_ARTICLE_VIEW | ACCESS_GOODS_VIEW; // 10100
var editor = guest | ACCESS_ARTICLE_EDIT | ACCESS_GOODS_EDIT; // 11110
var admin = editor | ACCESS_ADMIN; // 11111

/*alert(editor & ACCESS_ADMIN); // 0, доступа нет
alert(editor & ACCESS_ARTICLE_EDIT); // 8, доступ есть*/

var check = ACCESS_GOODS_VIEW | ACCESS_GOODS_EDIT; // 6, 00110

/*alert( admin & check ); // не 0, значит есть доступ к просмотру ИЛИ изменению*/

function isInteger(num) {
   return (num ^ 0) === num;
}

/*
alert(isInteger(1));
alert(isInteger(1.5));
alert(isInteger(-0.5));*/

/*var years = prompt("How old are you?", 100);*/
/*alert ("You are " + years + " old!");*/

/*var isAdmin = confirm("Are you admin?");*/
/*alert(isAdmin);*/







