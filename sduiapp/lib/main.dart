import 'dart:convert';

import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:json_dynamic_widget/json_dynamic_widget.dart';
import 'package:sduiapp/sdui.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        // This is the theme of your application.
        //
        // Try running your application with "flutter run". You'll see the
        // application has a blue toolbar. Then, without quitting the app, try
        // changing the primarySwatch below to Colors.green and then invoke
        // "hot reload" (press "r" in the console where you ran "flutter run",
        // or simply save your changes to "hot reload" in a Flutter IDE).
        // Notice that the counter didn't reset back to zero; the application
        // is not restarted.
        primarySwatch: Colors.blue,
      ),
      home: const MyHomePage(title: 'Flutter Demo Home Page'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({Key? key, required this.title}) : super(key: key);

  // This widget is the home page of your application. It is stateful, meaning
  // that it has a State object (defined below) that contains fields that affect
  // how it looks.

  // This class is the configuration for the state. It holds the values (in this
  // case the title) provided by the parent (in this case the App widget) and
  // used by the build method of the State. Fields in a Widget subclass are
  // always marked "final".

  final String title;

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  var registry = JsonWidgetRegistry.instance;
  Future<JsonWidgetData>? _future;

  @override
  void initState() {
    super.initState();
    _future = _buildWidget(context);
  }

  Future<JsonWidgetData> _buildWidget(BuildContext context) async {
    try {
      var url = '<YOUR-UICODE-URL>';
      // http.Response response = await http.get(Uri.parse(url));
      // var dataJson = json.decode(response.body);
      final String response = await rootBundle.loadString('assets/jsons/forms.json');
      final data1 = await json.decode(response);

      var data = JsonWidgetData.fromDynamic(data1);
        return data!;


    } on Exception catch (e) {
      print(e);
      return JsonWidgetData.fromDynamic({})!;
    }
  }

  @override
  Widget build(BuildContext context) {
    registry.registerFunctions({
      'Cancel': ({args, required registry}) => () {
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(
            content: Text("Cancel was pressed"),
            duration: Duration(milliseconds: 1000),
          ),
        );
      },
      'Delete': ({args, required registry}) => () {
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(
            content: Text("Delete was pressed"),
            duration: Duration(milliseconds: 1000),
          ),
        );
      },
    });
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
      ),
      body: FutureBuilder<JsonWidgetData>(
          future: _future,
          builder:
              (BuildContext context, AsyncSnapshot<JsonWidgetData> snapshot) {
            if (snapshot.hasError) {
              print(snapshot.error);
            }
            if (snapshot.connectionState == ConnectionState.waiting) {
              return Center(child: CircularProgressIndicator());
            } else {
              return snapshot.hasData
                  ? SizedBox.expand(
                child: snapshot.data?.build(context: context),
              )
                  : Center(child: CircularProgressIndicator());
            }
          }),
      floatingActionButton: new FloatingActionButton(
          onPressed: () {
            setState(() {
              this._future = _buildWidget(context);
            });
          },
          child: TextButton(
            onPressed: () {set_value('last_name','');},
            child: Text("SUBSCRIBE")
          )),
      // This trailing comma makes auto-formatting nicer for build methods.
    );
  }
}
set_value(val, dal) {

}