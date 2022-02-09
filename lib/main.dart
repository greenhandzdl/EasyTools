import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

void main() => runApp(gjgames());

class gjgames extends StatelessWidget{
  @override
  Widget build(BuildContext context){
    return MaterialApp(
      title: 'gjgames',
      theme: ThemeData(
        primarySwatch: Colors.red,
      ),
      home: Scaffold(
        appBar: new AppBar(
          title:new Text('This is my first project'),
        ),
        body: Center(
          children:[
              new Text('Welcome!',
              maxLines: 2,
              overflow: TextOverflow.ellipsis,
              style: TextStyle(
                color:Colors.pink,
                fontSize: 64,
                decoration: TextDecoration.underline
              ),
            ),
            ],
          ),
        ),
      ),
    );
  }
}