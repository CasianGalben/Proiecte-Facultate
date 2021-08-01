//============================================================================
// Name        : DSet.cpp
// Version     :
// Copyright   : Your copyright notice
// Description : This program computes the connected components of an
//             : undirected graph, using the linked list representation
//             : of disjoint sets
//============================================================================

#include <iostream>
#include <sstream>
#include <map>
#include <set>
#include "LinkedListElem.h"

using namespace std;

using ElPtr = LinkedListElem*;

void showComponent(ElPtr e) {
	while(e != 0) {
		cout << e->toString() << ' ';
		e=e->next;
	}
	cout << endl;
}

int main() {
	string line, a, b;

	if (getline(cin,line)) {
			istringstream iss(line);
			// line contains the ids of all nodes in the graph
			while (iss >> a) {
				// create a singleton set for every node id
				elem[a] = LinkedListElem::MakeSet(a);
			}
	}

	while (cin >> a >> b) {
		LinkedListElem::Union(elem[a],elem[b]);
	}

	for(auto const& t: tail) {
		cout << "Component: ";
		showComponent(t.first);
	}

	return 0;
}
