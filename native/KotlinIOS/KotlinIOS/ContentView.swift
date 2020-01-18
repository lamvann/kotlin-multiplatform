//
//  ContentView.swift
//  KotlinIOS
//
//  Created by Eli Ruiz on 1/14/20.
//  Copyright © 2020 Eli Ruiz. All rights reserved.
//

import SwiftUI
import SharedCode

struct ContentView: View {
    var body: some View {
        var platformMessage = CommonKt.createApplicationMessage()
        return Text(platformMessage)
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
