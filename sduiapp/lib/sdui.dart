const sduiJson = {
  "type": "center",
  "child": {
    "type": "container",
    "args": {
      "width": "300"
    },
    "child": {
      "type": "card",
      "args": {
        "elevation": 10,
        "shape": {
          "type": "rounded",
          "borderRadius": 15
        }
      },
      "child": {
        "type": "column",
        "args": {
          "mainAxisSize": "min"
        },
        "children": [{
          "type": "list_tile",
          "args": {
            "leading": {
              "type": "icon",
              "args": {
                "icon": {
                  "codePoint": 59083,
                  "fontFamily": "MaterialIcons"
                },
                "size": 30,
                "color":"#ffcc00"
              }
            },
            "title": {
              "type": "text",
              "args": {
                "text": "Remove Item",
                "style":{
                  "fontSize": 20.0,
                  "fontWeight":"bold"
                },
                "textAlign":"left"
              }
            }
          }
        },
          {
            "type": "container",
            "args": {
              "alignment": "topCenter",
              "padding": [16, 8,8,0],
              "width": "infinity"
            },
            "child":{
              "type":"text",
              "args":{
                "text" :"You want to remove this item from your order?",
                "textAlign":"left",
                "style":{
                  "fontSize":"16.0"

                }
              }
            }
          },
          {
            "type": "container",
            "args": {
              "alignment": "topCenter",
              "padding": [16, 8,8,0],
              "width": "infinity"
            },
            "child":{
              "type":"text",
              "args":{
                "text" :"You want to remove this item from your order?",
                "textAlign":"left",
                "style":{
                  "fontSize":"16.0"

                }
              }
            }
          },
          {
            "type": "radio",
            "args": {
              "groupValue": "2",
              "id": "radioGroupValue",
              "value": "radioValue1"
            }
          },
          {
            "type": "text",
            "args": {
              "text": "HEy"
            }
          }
          ]
      }
    }
  }
};